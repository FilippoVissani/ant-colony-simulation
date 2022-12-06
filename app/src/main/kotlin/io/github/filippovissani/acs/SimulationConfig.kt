/*
 * Copyright 2022 Filippo Vissani
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.filippovissani.acs

import io.github.filippovissani.acs.model.*

object SimulationConfig {
  val deltaTime = 0.1
  val bound: Int = 800
  val bounds: Boundary<Int> = Boundary.create(0, bound, 0, bound)
  val nestPosition = Pair.create(400, 400)
  val nestShape = ShapeFactory.rectangle(
    Pair.create(nestPosition.x - 2, nestPosition.y - 2),
    Pair.create(nestPosition.x + 2, nestPosition.y + 2),
  )
  val nest: Nest = Nest.create(
    nestShape,
    0,
    )
  val ant: Ant = Ant.create(
    Pair.create(10, 10),
    10.0,
    ShapeFactory.rectangle(Pair.create(8, 8), Pair.create(12, 12)),
    )
  val initialState: SimulationState = SimulationState.create(
    0.0,
    Environment.create(
      nest,
      HashSet(),
      HashSet(),
      bounds,
      HashSet(),
    ),
    HashSet<Ant>().plus(ant)
  )
}