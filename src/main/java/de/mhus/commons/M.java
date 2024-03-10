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
package de.mhus.commons;

import com.fasterxml.jackson.databind.JsonNode;
import de.mhus.commons.services.IService;
import de.mhus.commons.services.MService;
import de.mhus.commons.tools.MCast;
import de.mhus.commons.tools.MJson;
import de.mhus.commons.tools.MString;
import de.mhus.commons.util.EmptyList;
import de.mhus.commons.util.EnumerationIterator;
import de.mhus.commons.util.Iterate;

import java.nio.charset.Charset;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.UUID;

/**
 * This is a shortcut class to call methods without obfuscating the source code. For some reasons this makes sense.
 *
 * @author mikehummel
 */
public class M {

    public static final UUID EMPTY_UUID = UUID.fromString("00000000-0000-0000-0000-000000000000");
    public static final String[] EMPTY_STRING_ARRAY = new String[0];
    public static final int[] EMPTY_INT_ARRAY = new int[0];
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    public static final long[] EMPTY_LONG_ARRAY = new long[0];
    public static final double[] EMPTY_DOUBLE_ARRAY = new double[0];
    public static final float[] EMPTY_FLOAT_ARRAY = new float[0];
    public static final Object[] EMPTY_OBJECT_ARRAY = new Object[0];

    public static final Locale LOCALE_DE_DE = new Locale("de", "DE");
    public static final Locale LOCALE_EN_US = new Locale("en", "US");

    public static final String PROP_PREFIX = "mhus.commons.";

    public static final String CHARSET_UTF_8 = "UTF-8";
    public static final String CHARSET_UTF_16 = "UTF-16";
    public static final String CHARSET_ISO_8859_1 = "ISO-8859-1";

    public static final Charset UTF_8 = Charset.forName("UTF-8");
    public static final Charset UTF_16 = Charset.forName("UTF-16");

    public static final String PROP_DIRTY_TRACE = "mhu.lib.api.trace";
    public static final String PROP_API_FACTORY_CLASS = "mhus.api.factory";
    // public static final String PROP_FILE_WATCH = "mhus.config.watch";
    public static final String PROP_CONFIG_FILE = PROP_PREFIX + "config.file";

    public static final int MAX_DEPTH_LEVEL = 20;

    public static final String ADDR_EMAIL = "email";
    public static final String ADDR_SALUTATION = "salutation";
    public static final String ADDR_NAME_TITLE = "nameTitle";
    public static final String ADDR_FIRST_NAME = "firstName";
    public static final String ADDR_NAME_MID = "nameMid";
    public static final String ADDR_LAST_NAME = "lastName";
    public static final String ADDR_NAME_AFFIX = "nameAffix";
    public static final String ADDR_TOWN = "town";
    public static final String ADDR_ZIP = "zip";
    public static final String ADDR_STREET = "street";
    public static final String ADDR_HOUSE_NUMBER = "houseNumber";
    public static final String ADDR_PHONE = "phone";
    public static final String ADDR_MOBILE = "mobile";
    public static final String ADDR_COUNTRY = "country";

    public static final String ADDR_DISPLAY_NAME = "displayName";

    public static enum ADDR_SCOPE {
        PRIVATE, WORK
    }

    public static final String TYPE_DATE = "date";
    public static final String TYPE_RAW = "raw";
    public static final String TYPE_BOOL = "bool";
    public static final String TYPE_INT = "int";
    public static final String TYPE_TEXT = "text";
    public static final String TYPE_STRING = "string";
    public static final String TYPE_LONG = "long";
    public static final String TYPE_FLOAT = "float";
    public static final String TYPE_DOUBLE = "double";

    public static final String PARAM_AUTH_TOKEN = "auth_token";

}
