/* Copyright (c) 2023 StuyPulse Robotics. All rights reserved. */
/* This work is licensed under the terms of the MIT license */
/* found in the root directory of this project. */

package org.troyargonauts.common.streams.vectors.filters;

import org.troyargonauts.common.math.Vector2D;
import org.troyargonauts.common.streams.filters.IFilter;

/**
 * A filter that applies separate IFilters to the x and y component of a VFilter
 *
 * @author Sam (sam.belliveau@gmail.com)
 */
public class XYFilter implements VFilter {

    private final IFilter mXFilter;
    private final IFilter mYFilter;

    public XYFilter(IFilter xFilter, IFilter yFilter) {
        mXFilter = xFilter;
        mYFilter = yFilter;
    }

    public Vector2D get(Vector2D next) {
        return new Vector2D(mXFilter.get(next.x), mYFilter.get(next.y));
    }
}
