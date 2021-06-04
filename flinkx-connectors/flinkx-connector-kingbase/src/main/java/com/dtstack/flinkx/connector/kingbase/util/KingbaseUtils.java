/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dtstack.flinkx.connector.kingbase.util;

import com.dtstack.flinkx.connector.jdbc.util.JdbcUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.Pair;

import java.sql.Connection;
import java.util.List;

/**
 * @description:
 * @program: flinkx-all
 * @author: lany
 * @create: 2021/05/20 19:12
 */
public class KingbaseUtils {

    /**
     * get table metadata with tableName and schemaName.
     *
     * @param schemaName
     * @param tableName
     * @param dbConn
     *
     * @return
     */
    public static Pair<List<String>, List<String>> getTableMetaData(
            String schemaName,
            String tableName,
            Connection dbConn) {
        return JdbcUtil.getTableMetaData(StringUtils.upperCase(schemaName), StringUtils.upperCase(tableName), dbConn);
    }
}