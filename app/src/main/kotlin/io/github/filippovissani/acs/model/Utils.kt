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

/**
 * Represents a pair of elements.
 * [x] is the first element.
 * [y] is the second element.
 */
data class Pair<out X, out Y>(val x: X, val y: Y)

/**
 * Represents the bounds of a simulation.
 * [rightBound] > [leftBound] and [bottomBound] > [topBound]
 */
data class Boundary<out T>(
  val leftBound: T,
  val rightBound: T,
  val topBound: T,
  val bottomBound: T,
  )
