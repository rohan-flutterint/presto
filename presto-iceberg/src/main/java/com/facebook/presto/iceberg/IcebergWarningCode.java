/*
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
package com.facebook.presto.iceberg;

import com.facebook.presto.spi.WarningCode;
import com.facebook.presto.spi.WarningCodeSupplier;

public enum IcebergWarningCode
        implements WarningCodeSupplier
{
    SORT_COLUMN_TRANSFORM_NOT_SUPPORTED_WARNING(1),
    USE_OF_DEPRECATED_TABLE_PROPERTY(2)
    /**/;

    public static final int WARNING_CODE_MASK = 0x0200_0000;

    private final WarningCode warningCode;

    IcebergWarningCode(int code)
    {
        warningCode = new WarningCode(code + WARNING_CODE_MASK, name());
    }

    @Override
    public WarningCode toWarningCode()
    {
        return warningCode;
    }
}
