/*
 * Copyright (C) 2020 The exTHmUI Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.exthmui.game.qs;

import android.content.Context;

import org.exthmui.game.R;
import org.exthmui.game.misc.Constants;

public class LockNavbarTile extends TileBase {
    public LockNavbarTile(Context context) {
        super(context, context.getString(R.string.qs_lock_navbar), Constants.GamingActionTargets.DISABLE_NAVBAR, R.drawable.ic_qs_disable_navbar);
    }
}
