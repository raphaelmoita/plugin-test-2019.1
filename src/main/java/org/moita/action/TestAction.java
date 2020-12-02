package org.moita.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

public class TestAction extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        Messages.showInfoMessage("Hello World!", "Hello");
    }
}
