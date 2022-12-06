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

enum class AntState { SEARCHING, RETURNING }

interface Ant {
  val position: Pair<Int, Int>
  val life: Double
  val perceptionFiled: PerceptionFiled
  val hasFood: Boolean
  val memorizedPath: Path
  val state: AntState

  companion object{
    fun create(
      position: Pair<Int, Int>,
      life: Double,
      perceptionFiled: PerceptionFiled,
      hasFood: Boolean = false,
      path: Path = ArrayList(),
      state: AntState = AntState.SEARCHING,
    ): Ant = AntImpl(position, life, perceptionFiled, hasFood, path, state)

    private data class AntImpl(
      override val position: Pair<Int, Int>,
      override val life: Double,
      override val perceptionFiled: PerceptionFiled,
      override val hasFood: Boolean,
      override val memorizedPath: Path,
      override val state: AntState,
    ) : Ant
  }
}