package com.devepos.adt.tools.base.ui.tree;

import com.devepos.adt.tools.base.elementinfo.IElementInfoProvider;
import com.devepos.adt.tools.base.elementinfo.ILazyLoadableContent;

/**
 * Node which supports lazy loading
 *
 * @author stockbal
 */
public interface ILazyLoadingNode extends ITreeNode, ILazyLoadableContent {

	/**
	 * Refresh the content of the lazy loading node
	 */
	void resetLoadedState();

	/**
	 * @return <code>true</code> if the node's contents are fully loaded
	 */
	boolean isLoaded();

	/**
	 * Loads the child nodes of the node
	 */
	void loadChildren();

	/**
	 * @return <code>true</code> if this node is currently loading it's content
	 */
	boolean isLoading();

	/**
	 * Returns a descriptive name for the Job to load content of the lazy loading
	 * node
	 *
	 * @return
	 */
	String getLazyLoadingJobName();

	/**
	 * Sets the lazy loading function for this lazy loading node
	 *
	 * @param provider the provider for retrieving element information;
	 */
	void setElementInfoProvider(IElementInfoProvider provider);

	/**
	 * Adds a listener for updates of the lazy loading status. Has no effect if the
	 * same listener was already added
	 *
	 * @param l the listener to be added
	 */
	void addLazyLoadingListener(ILazyLoadingListener l);

	/**
	 * Removes a listener for updates of the lazy loading status. Has no effect if
	 * the same listener was already removed
	 *
	 * @param l the listener to be removed
	 */
	void removeLazyLoadingListener(ILazyLoadingListener l);
}
