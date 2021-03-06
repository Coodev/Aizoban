package com.jparkie.aizoban.views;

import com.jparkie.aizoban.views.base.BaseContextView;
import com.jparkie.aizoban.views.base.BaseEmptyRelativeLayoutView;
import com.jparkie.aizoban.views.base.BaseSelectionView;

public interface AddToQueueView extends BaseContextView, BaseEmptyRelativeLayoutView, BaseSelectionView {
    public void overrideToggleButton();
}
