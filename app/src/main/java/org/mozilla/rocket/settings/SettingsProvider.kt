/* -*- Mode: Java; c-basic-offset: 4; tab-width: 20; indent-tabs-mode: nil; -*-
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.mozilla.rocket.settings

import android.content.Context
import org.mozilla.rocket.preference.AndroidPreferencesFactory
import org.mozilla.rocket.preference.GlobalPreferencesFactory

class SettingsProvider(context: Context) {
    val privateBrowsingSettings by lazy {
        PrivateBrowsingSettings(context, GlobalPreferencesFactory())
    }

    val globalSettings by lazy {
        GlobalSettings(context, AndroidPreferencesFactory())
    }
}
