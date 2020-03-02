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

/**
 * 读取消息结果
 */
public enum GetMessageStatus {

    /**
     * 已找到消息
     */
    FOUND,

    /**
     * 消费队列无消息
     */
    NO_MATCHED_MESSAGE,

    /**
     * 从commitLog无法读取到消息，说明该消息对应的文件（MappedFile）已经删除，需计算下一个MappedFile的起始位置
     */
    MESSAGE_WAS_REMOVING,

    /**
     * 未找到消息
     */
    OFFSET_FOUND_NULL,

    /**
     * 查询offset 超过 消费队列 太多(大于一个位置)
     */
    OFFSET_OVERFLOW_BADLY,

    /**
     * 查询offset 超过 消费队列 一个位置
     */
    OFFSET_OVERFLOW_ONE,

    /**
     * 查询offset 太小
     */
    OFFSET_TOO_SMALL,

    /**
     * 没找到指定消费队列
     */
    NO_MATCHED_LOGIC_QUEUE,

    /**
     * 消费队列中没有消息
     */
    NO_MESSAGE_IN_QUEUE,
}
