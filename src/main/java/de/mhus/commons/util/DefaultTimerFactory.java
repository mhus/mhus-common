/**
 * Copyright (C) 2002 Mike Hummel (mh@mhus.de)
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
package de.mhus.commons.util;

import java.util.Timer;

import de.mhus.lib.annotations.activator.ObjectFactory;
import de.mhus.lib.common.service.TimerFactory;
import de.mhus.lib.common.service.TimerIfc;
import de.mhus.lib.common.service.TimerImpl;

public class DefaultTimerFactory implements TimerFactory, ObjectFactory {

    private Timer timer;

    @Override
    public TimerIfc getTimer() {
        init();
        return new TimerImpl(timer);
    }

    @Override
    public Object create(Class<?> clazz, Class<?>[] classes, Object[] objects) {
        init();
        return new TimerImpl(timer);
    }

    private synchronized void init() {
        if (timer == null) timer = new Timer(TimerIfc.class.getCanonicalName(), true);
    }
}
