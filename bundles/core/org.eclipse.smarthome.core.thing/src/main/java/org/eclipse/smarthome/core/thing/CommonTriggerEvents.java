/**
 * Copyright (c) 2014,2017 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.smarthome.core.thing;

/**
 * Contains often used trigger events.
 *
 * @author Moritz Kammerer - Initial contribution and API.
 */
public final class CommonTriggerEvents {
    /**
     * Static class - no instances allowed.
     */
    private CommonTriggerEvents() {
    }

    public static final String PRESSED = "PRESSED";
    public static final String RELEASED = "RELEASED";
    public static final String SHORT_PRESSED = "SHORT_PRESSED";
    public static final String DOUBLE_PRESSED = "DOUBLE_PRESSED";
    public static final String LONG_PRESSED = "LONG_PRESSED";
    public static final String DIR1_PRESSED = "DIR1_PRESSED";
    public static final String DIR1_RELEASED = "DIR1_RELEASED";
    public static final String DIR2_PRESSED = "DIR2_PRESSED";
    public static final String DIR2_RELEASED = "DIR2_RELEASED";

}
