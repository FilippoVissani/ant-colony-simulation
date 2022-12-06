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

package io.github.filippovissani.acs.view

import io.github.filippovissani.acs.controller.DisplayData
import java.awt.Dimension
import javax.swing.JFrame

object OutputModule{

  interface Output{
    fun display(displayData: DisplayData)

    companion object{
      fun create(): Output = OutputImpl()

      private class OutputImpl(): Output {
        private val frame = JFrame("Ant Colony Simulation")

        init {
          frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
          frame.size = Dimension(600, 400)
          frame.setLocationRelativeTo(null)
          frame.isVisible = true
        }

        override fun display(displayData: DisplayData) {
          TODO("Not yet implemented")
        }
      }
    }
  }

  interface Component {
    val output: Output
  }
}