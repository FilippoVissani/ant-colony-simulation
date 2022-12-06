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

object ModelModule{

  interface Model{
    val deltaTime: Double
    fun moveAntsNextPosition(simulationState: SimulationState): SimulationState
    fun ageEntities(simulationState: SimulationState): SimulationState
    fun incrementVirtualTime(simulationState: SimulationState): SimulationState

    companion object{
      fun create(deltaTime: Double, configuration: SimulationState): Model =
        ModelImpl(deltaTime, configuration)

      private class ModelImpl(override val deltaTime: Double, val initialState: SimulationState): Model {

        override fun moveAntsNextPosition(simulationState: SimulationState): SimulationState {
          TODO("Not yet implemented")
        }

        override fun ageEntities(simulationState: SimulationState): SimulationState {
          TODO("Not yet implemented")
        }

        override fun incrementVirtualTime(simulationState: SimulationState): SimulationState {
          TODO("Not yet implemented")
        }
      }
    }
  }

  interface Component {
    val model: Model
  }
}