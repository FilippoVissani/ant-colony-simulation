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
typealias Path = List<Pair<Int, Int>>
typealias PheromonePathway = Pair<Int, Path>

interface Pair<out X, out Y> {
  val x: X
  val y: Y

  companion object{
    fun <X, Y> create(x: X, y: Y): Pair<X, Y> = PairImpl(x, y)

    private data class PairImpl<out X, out Y>(override val x: X, override val y: Y) : Pair<X, Y>
  }
}

interface Boundary<out T> {
  val leftBound: T
  val rightBound: T
  val topBound: T
  val bottomBound: T

  companion object{
    fun <T> create(
      leftBound: T,
      rightBound: T,
      topBound: T,
      bottomBound: T,
    ): Boundary<T> = BoundaryImpl(leftBound, rightBound, topBound, bottomBound)

    private data class BoundaryImpl<out T>(
      override val leftBound: T,
      override val rightBound: T,
      override val topBound: T,
      override val bottomBound: T,
    ) : Boundary<T>
  }
}
