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

package io.github.filippovissani.acs.controller

import io.github.filippovissani.acs.model.ModelModule
import io.github.filippovissani.acs.model.SimulationState
import io.github.filippovissani.acs.view.OutputModule

typealias DisplayData = SimulationState

object ControllerModule{

  interface Controller{
    fun startSimulation()
    fun stopSimulation()

    companion object{
      fun create(context: Component): Controller = ControllerImpl(context)

      private class ControllerImpl(private val context: Component): Controller {
        override fun startSimulation() {
          TODO("Not yet implemented")
        }

        override fun stopSimulation() {
          TODO("Not yet implemented")
        }
      }
    }
  }

  interface Component : ModelModule.Component, OutputModule.Component {
    val controller: Controller
  }
}