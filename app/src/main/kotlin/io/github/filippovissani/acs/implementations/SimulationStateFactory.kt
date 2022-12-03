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

package io.github.filippovissani.acs.implementations

import io.github.filippovissani.acs.contracts.Ant
import io.github.filippovissani.acs.contracts.Environment
import io.github.filippovissani.acs.contracts.SimulationState

object SimulationStateFactory {
  fun create(virtualTime: Double, environment: Environment, ants: Set<Ant>): SimulationState =
    SimulationStateImpl(virtualTime, environment, ants)

  fun fromSimulationState(
    simulationState: SimulationState,
    virtualTime: Double = simulationState.virtualTime,
    environment: Environment = simulationState.environment,
    ants: Set<Ant> = simulationState.ants,
  ): SimulationState = SimulationStateImpl(virtualTime, environment, ants)

  private data class SimulationStateImpl(
    override val virtualTime: Double,
    override val environment: Environment,
    override val ants: Set<Ant>,
    ) : SimulationState
}