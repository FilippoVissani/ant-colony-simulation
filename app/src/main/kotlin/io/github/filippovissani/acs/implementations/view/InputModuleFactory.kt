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

package io.github.filippovissani.acs.implementations.view

import io.github.filippovissani.acs.contracts.view.InputModule

object InputModuleFactory{
  fun create(context: InputModule.Component): InputModule.Input = InputImpl(context)

  private class InputImpl(private val context: InputModule.Component): InputModule.Input {
    override fun btnStartPressed() {
      TODO("Not yet implemented")
    }

    override fun btnStopPressed() {
      TODO("Not yet implemented")
    }
  }
}
