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
package org.eclipse.smarthome.model.validation

import org.eclipse.smarthome.model.items.ModelItem
import org.eclipse.xtext.validation.Check
import org.eclipse.smarthome.model.items.ItemsPackage

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class ItemsValidator extends AbstractItemsValidator {

	@Check
	def checkItemName(ModelItem item) {
		if (item === null || item.name === null) {
			return
		}
		if (item.name.contains("-")) {
			error('Item name must not contain dashes.', ItemsPackage.Literals.MODEL_ITEM__NAME)
		}
	}
}
