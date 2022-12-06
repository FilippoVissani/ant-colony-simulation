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

import io.github.filippovissani.acs.model.ShapeFactory
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.github.filippovissani.acs.model.Pair

class ShapeFactoryTest : FunSpec({

  test("Rectangle from (0, 0) to (2, 2) should have size 9") {
    ShapeFactory.rectangle(
      Pair.create(0, 0),
      Pair.create(2, 2)
    ).size shouldBe 9
  }
})
