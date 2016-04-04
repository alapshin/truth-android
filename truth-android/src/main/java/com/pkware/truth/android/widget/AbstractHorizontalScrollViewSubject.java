/*
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

import android.widget.HorizontalScrollView;

import com.google.common.truth.FailureStrategy;

import static com.google.common.truth.Truth.assertThat;

public abstract class AbstractHorizontalScrollViewSubject<S extends AbstractHorizontalScrollViewSubject<S, T>, T extends HorizontalScrollView>
    extends AbstractFrameLayoutSubject<S, T> {
  protected AbstractHorizontalScrollViewSubject(FailureStrategy failureStrategy, T subject) {
    super(failureStrategy, subject);
  }

  public S hasMaximumScrollAmount(int amount) {
    assertThat(getSubject().getMaxScrollAmount())
        .named("maximum scroll amount")
        .isEqualTo(amount);
    //noinspection unchecked
    return (S) this;
  }

  public S isFillingViewport() {
    assertThat(getSubject().isFillViewport())
        .named("is filling viewport")
        .isTrue();
    //noinspection unchecked
    return (S) this;
  }

  public S isNotFillingViewport() {
    assertThat(getSubject().isFillViewport())
        .named("is filling viewport")
        .isFalse();
    //noinspection unchecked
    return (S) this;
  }

  public S isSmoothScrollingEnabled() {
    assertThat(getSubject().isSmoothScrollingEnabled())
        .named("is smooth scrolling enabled")
        .isTrue();
    //noinspection unchecked
    return (S) this;
  }

  public S isSmoothScrollingDisabled() {
    assertThat(getSubject().isSmoothScrollingEnabled())
        .named("is smooth scrolling enabled")
        .isFalse();
    //noinspection unchecked
    return (S) this;
  }
}