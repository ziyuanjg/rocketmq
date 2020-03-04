/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.rocketmq.store;

public enum PutMessageStatus {

    /**
     * 持久化消息成功
     */
    PUT_OK,

    /**
     * 刷盘超时
     */
    FLUSH_DISK_TIMEOUT,

    /**
     * 刷从节点超时
     */
    FLUSH_SLAVE_TIMEOUT,

    /**
     * 从节点失效
     */
    SLAVE_NOT_AVAILABLE,

    /**
     * 服务失效
     */
    SERVICE_NOT_AVAILABLE,

    /**
     * 创建文件失败
     */
    CREATE_MAPEDFILE_FAILED,

    /**
     * 消息非法
     */
    MESSAGE_ILLEGAL,

    /**
     * 属性长度错误
     */
    PROPERTIES_SIZE_EXCEEDED,

    /**
     * 磁盘阻塞
     */
    OS_PAGECACHE_BUSY,

    /**
     * 未知错误
     */
    UNKNOWN_ERROR,
}
