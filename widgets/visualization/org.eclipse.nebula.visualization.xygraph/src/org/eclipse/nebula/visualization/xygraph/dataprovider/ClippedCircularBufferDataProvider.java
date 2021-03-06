/*******************************************************************************
 * Copyright (c) 2013, 2017 Max Hohenegger and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Max Hohenegger - initial API and implementation - Bug 418168
 *******************************************************************************/
package org.eclipse.nebula.visualization.xygraph.dataprovider;

import org.eclipse.nebula.visualization.xygraph.dataprovider.CircularBufferDataProvider;

/**
 * {@link CircularBufferDataProvider} with a limited window on the trace data
 * for computing data ranges.
 */
public class ClippedCircularBufferDataProvider extends CircularBufferDataProvider {
	private int clippingWindow;

	public ClippedCircularBufferDataProvider(boolean chronological, int bufferSize, int clippingWindow) {
		super(chronological);
		setBufferSize(bufferSize);
		setClippingWindow(clippingWindow);
	}

	public void setClippingWindow(int clippingWindow) {
		assert clippingWindow > 0;
		assert clippingWindow <= getSize();
		this.clippingWindow = clippingWindow;
	}

	public int getClippingWindow() {
		return clippingWindow;
	}

}
