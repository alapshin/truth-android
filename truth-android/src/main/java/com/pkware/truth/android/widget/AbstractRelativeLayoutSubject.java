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

import android.annotation.TargetApi;
import android.widget.RelativeLayout;

import com.google.common.truth.FailureStrategy;
import com.pkware.truth.android.view.AbstractViewGroupSubject;

import static android.os.Build.VERSION_CODES.JELLY_BEAN;
import static com.google.common.truth.Truth.assertThat;

public abstract class AbstractRelativeLayoutSubject<S extends AbstractRelativeLayoutSubject<S, T>, T extends RelativeLayout>
    extends AbstractViewGroupSubject<S, T> {
  protected AbstractRelativeLayoutSubject(FailureStrategy failureStrategy, T subject) {
    super(failureStrategy, subject);
  }

  @TargetApi(JELLY_BEAN)
  public S hasGravity(int gravity) {
    assertThat(actual().getGravity())
        .named("gravity")
        .isEqualTo(gravity);
    //noinspection unchecked
    return (S) this;
  }
}
