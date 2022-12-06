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

interface Environment {
  val nest: Nest
  val obstacles: Set<Obstacle>
  val food: Set<Food>
  val bounds: Boundary<Int>
  val pheromonePathways: Set<PheromonePathway>

  companion object{
    fun create(
      nest: Nest,
      obstacles: Set<Obstacle>,
      food: Set<Food>,
      bounds: Boundary<Int>,
      pheromonePathways: Set<PheromonePathway>,
    ): Environment = EnvironmentImpl(nest, obstacles, food, bounds, pheromonePathways)

    private data class EnvironmentImpl(
      override val nest: Nest,
      override val obstacles: Set<Obstacle>,
      override val food: Set<Food>,
      override val bounds: Boundary<Int>,
      override val pheromonePathways: Set<PheromonePathway>
    ) : Environment
  }
}