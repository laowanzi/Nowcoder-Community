package com.nowcoder.community.entity;

import lombok.Data;

/**
 * 封装分页相关信息
 */
@Data
public class Page {

    // 当前的页码
    private int current = 1;
    private int limit = 10;
    private int rows;
    private String path;

    public int getOffset() {
        return (current - 1) * limit;
    }

    /**
     *
     * @return
     */
    public int getTotal() {
        if (rows % limit == 0) {
            return rows / limit;
        } else {
            return rows / limit + 1;
        }
    }

    public int getFrom() {
        int from = current - 2;
        return Math.max(from, 1);

    }

    public int getTo() {
        int to = current + 2;
        int total = getTotal();
        return Math.min(to, total);
    }
}
