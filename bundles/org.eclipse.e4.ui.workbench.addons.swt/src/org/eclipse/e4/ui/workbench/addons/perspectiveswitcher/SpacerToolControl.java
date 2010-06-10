/*******************************************************************************
 * Copyright (c) 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 ******************************************************************************/

package org.eclipse.e4.ui.workbench.addons.perspectiveswitcher;

import javax.annotation.PostConstruct;
import org.eclipse.e4.ui.model.application.ui.menu.MToolControl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class SpacerToolControl {
	@PostConstruct
	void createWidget(Composite parent, MToolControl tc) {
		tc.getTags().add("stretch"); //$NON-NLS-1$
		Composite comp = new Composite(parent, SWT.NO_BACKGROUND);
		comp.setSize(0, 0);
	}
}
