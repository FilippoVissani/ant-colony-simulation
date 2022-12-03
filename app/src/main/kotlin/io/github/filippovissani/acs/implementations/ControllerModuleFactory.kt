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
import io.github.filippovissani.acs.contracts.ControllerModule

object ControllerModuleFactory{
  fun create(context: ControllerModule.Component): ControllerModule.Controller = ControllerImpl(context)

  private class ControllerImpl(private val context: ControllerModule.Component): ControllerModule.Controller {
    override fun startSimulation() {
      TODO("Not yet implemented")
    }

    override fun stopSimulation() {
      TODO("Not yet implemented")
    }
  }
}
