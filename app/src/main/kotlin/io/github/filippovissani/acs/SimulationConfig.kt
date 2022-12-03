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

import io.github.filippovissani.acs.contracts.Ant
import io.github.filippovissani.acs.contracts.Boundary
import io.github.filippovissani.acs.contracts.Nest
import io.github.filippovissani.acs.contracts.SimulationState
import io.github.filippovissani.acs.implementations.EntityFactory
import io.github.filippovissani.acs.implementations.ShapeFactory
import io.github.filippovissani.acs.implementations.SimulationStateFactory
import io.github.filippovissani.acs.implementations.UtilsFactory

object SimulationConfig {
  const val DELTA_TIME = 0.1
  val nest: Nest = EntityFactory.createNest(ShapeFactory.createRectangle(UtilsFactory.createPair(10, 10), UtilsFactory.createPair(12, 12)), 0)
  val bounds: Boundary<Int> = UtilsFactory.createBoundary(0, 800, 0, 800)
  val ant: Ant = EntityFactory.createAnt(
    UtilsFactory.createPair(10, 10),
    10.0,
    ShapeFactory.createRectangle(UtilsFactory.createPair(8, 8), UtilsFactory.createPair(12, 12)),
    )
  val initialState: SimulationState = SimulationStateFactory.create(
    0.0,
    EntityFactory.createEnvironment(
      nest,
      HashSet(),
      HashSet(),
      bounds,
      HashSet(),
    ),
    HashSet<Ant>().plus(ant)
  )
}