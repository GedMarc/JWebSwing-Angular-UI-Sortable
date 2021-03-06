/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.angularuisortable;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.angular.AngularPageConfigurator;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;

import javax.validation.constraints.NotNull;

/**
 * The Angular UI Sortable Configurator
 *
 * @author GedMarc
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "Angular UI Sortable",
		pluginDescription = "This directive allows you to sort an array with drag & drop.",
		pluginUniqueName = "jwebswing-angular-ui-sortable",
		pluginVersion = "0.17.1",
		pluginCategories = "angular,touch, ui,web ui, framework",
		pluginSubtitle = "Instantly make UL lists into drag and drop items.",
		pluginSourceUrl = "https://github.com/angular-ui/ui-sortable",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-Angular-UI-Sortable/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-Angular-UI-Sortable",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "https://github.com/angular-ui/ui-sortable",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/AngularUISortable.jar/download")
public class AngularUISortablePageConfigurator
		implements IPageConfigurator<AngularUISortablePageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	/*
	 * Constructs a new AngularUISortablePageConfigurator
	 */
	public AngularUISortablePageConfigurator()
	{
		//Nothing needed
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return AngularUISortablePageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		AngularUISortablePageConfigurator.enabled = mustEnable;
	}

	@NotNull
	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured() && enabled())
		{
			JQueryPageConfigurator.setRequired(true);
			AngularPageConfigurator.setRequired(true);

			page.getBody()
			    .addJavaScriptReference(AngularUISortableReferencePool.AngularUISortable.getJavaScriptReference());
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return AngularUISortablePageConfigurator.enabled;
	}
}
