/*
 * Copyright (c) 2016, 2017, 2018 FabricMC
 *
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

package net.fabricmc.fabric.impl.entity;

import com.mojang.datafixers.types.Type;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCategory;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;

public class FabricEntityType<T extends Entity> extends EntityType<T> {
	private final int maxTrackDistance, trackTickInterval;
	private final Boolean alwaysUpdateVelocity;

	public FabricEntityType(EntityFactory<T> entityType$EntityFactory_1, EntityCategory entityCategory_1, boolean boolean_1, boolean boolean_2, boolean boolean_3, Type<?> type_1, EntitySize entitySize_1, int maxTrackDistance, int trackTickInterval, Boolean alwaysUpdateVelocity) {
		super(entityType$EntityFactory_1, entityCategory_1, boolean_1, boolean_2, boolean_3, type_1, entitySize_1);
		this.maxTrackDistance = maxTrackDistance;
		this.trackTickInterval = trackTickInterval;
		this.alwaysUpdateVelocity = alwaysUpdateVelocity;
	}

	@Override
	public int getMaxTrackDistance() {
		if (maxTrackDistance != -1) {
			return (maxTrackDistance + 15) / 16;
		}

		return super.getMaxTrackDistance();
	}

	@Override
	public int getTrackTickInterval() {
		if (trackTickInterval != -1) {
			return trackTickInterval;
		}

		return super.getTrackTickInterval();
	}

	@Override
	public boolean alwaysUpdateVelocity() {
		if (alwaysUpdateVelocity != null) {
			return alwaysUpdateVelocity;
		}

		return super.alwaysUpdateVelocity();
	}
}
