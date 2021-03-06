/*
 * Copyright 2013 Square, Inc.
 * Copyright 2016 PKWARE, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.pkware.truth.android.widget;

import android.widget.ListAdapter;

import com.google.common.truth.FailureStrategy;

import static com.google.common.truth.Truth.assertThat;

public abstract class AbstractListAdapterSubject<S extends AbstractListAdapterSubject<S, T>, T extends ListAdapter>
    extends AbstractAdapterSubject<S, T> {
  protected AbstractListAdapterSubject(FailureStrategy failureStrategy, T subject) {
    super(failureStrategy, subject);
  }

  public S hasAllItemsEnabled() {
    assertThat(actual().areAllItemsEnabled())
        .named("all items are enabled")
        .isTrue();
    //noinspection unchecked
    return (S) this;
  }

  public S hasAllItemsNotEnabled() {
    assertThat(actual().areAllItemsEnabled())
        .named("all items are enabled")
        .isFalse();
    //noinspection unchecked
    return (S) this;
  }
}
