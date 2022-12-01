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

package io.github.filippovissani.acs.model

typealias Shape = Set<Pair<Int, Int>>
typealias PerceptionFiled = List<Pair<Int, Int>>
typealias Path = List<Pair<Int, Int>>
typealias Obstacle = Shape
typealias Food = Shape

enum class AntState { SEARCHING, RETURNING }

data class Ant(
  val shape: Shape,
  val life: Double,
  val perceptionFiled: PerceptionFiled,
  val hasFood: Boolean = false,
  val path: Path = ArrayList(),
  val state: AntState = AntState.SEARCHING,
  )

data class Nest(val shape: Shape, val foodQuantity: Int)

data class Environment(
  val nest: Nest,
  val obstacles: Set<Obstacle>,
  val food: Set<Food>,
  val bounds: Boundary<Int>,
  val ants: Set<Ant>,
  val activePaths: Set<Path>,
)
