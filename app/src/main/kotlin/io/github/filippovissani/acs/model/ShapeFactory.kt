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

object ShapeFactory {
  fun rectangle(from: Pair<Int, Int>, to: Pair<Int, Int>): Shape {
    var rectangle: Shape = HashSet()
    for (i in from.x..to.x){
      for (j in from.y..to.y){
        rectangle = rectangle.plus(Pair.create(i, j))
      }
    }
    return rectangle
  }
}