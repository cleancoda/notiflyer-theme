package org.notiflyer.view.themes;

import java.util.List;

import javax.swing.JScrollPane.ScrollBar;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileView;
import javax.swing.plaf.DesktopPaneUI;
import javax.swing.plaf.PopupMenuUI;
import javax.swing.plaf.TableUI;
import javax.swing.plaf.ToolBarUI;

public class UIManagerDefaults {

    // Class variables for UIManager keys
    public static final String AUDITORY_CUES_ALL_AUDITORY_CUES = "AuditoryCues.allAuditoryCues";
    public static final String AUDITORY_CUES_CUE_LIST = "AuditoryCues.cueList";
    public static final String AUDITORY_CUES_DEFAULT_CUE_LIST = "AuditoryCues.defaultCueList";
    public static final String AUDITORY_CUES_NO_AUDITORY_CUES = "AuditoryCues.noAuditoryCues";
    public static final String BUTTON_BACKGROUND = "Button.background";
    public static final String BUTTON_BORDER = "Button.border";
    public static final String BUTTON_DARK_SHADOW = "Button.darkShadow";
    public static final String BUTTON_DEFAULT_BUTTON_FOLLOWS_FOCUS = "Button.defaultButtonFollowsFocus";
    public static final String BUTTON_DISABLED_TEXT = "Button.disabledText";
    public static final String BUTTON_DISABLED_TOOLBAR_BORDER_BACKGROUND = "Button.disabledToolBarBorderBackground";
    public static final String BUTTON_FOCUS = "Button.focus";
    public static final String BUTTON_FOCUS_INPUT_MAP = "Button.focusInputMap";
    public static final String BUTTON_FONT = "Button.font";
    public static final String BUTTON_FOREGROUND = "Button.foreground";
    public static final String BUTTON_GRADIENT = "Button.gradient";
    public static final String BUTTON_HIGHLIGHT = "Button.highlight";
    public static final String BUTTON_LIGHT = "Button.light";
    public static final String BUTTON_MARGIN = "Button.margin";
    public static final String BUTTON_ROLLOVER = "Button.rollover";
    public static final String BUTTON_ROLLOVER_ICON_TYPE = "Button.rolloverIconType";
    public static final String BUTTON_SELECT = "Button.select";
    public static final String BUTTON_SHADOW = "Button.shadow";
    public static final String BUTTON_TEXT_ICON_GAP = "Button.textIconGap";
    public static final String BUTTON_TEXT_SHIFT_OFFSET = "Button.textShiftOffset";
    public static final String BUTTON_TOOLBAR_BORDER_BACKGROUND = "Button.toolBarBorderBackground";
    public static final String BUTTON_UI = "ButtonUI";
    public static final String CHECKBOX_BACKGROUND = "CheckBox.background";
    public static final String CHECKBOX_BORDER = "CheckBox.border";
    public static final String CHECKBOX_DISABLED_TEXT = "CheckBox.disabledText";
    public static final String CHECKBOX_FOCUS = "CheckBox.focus";
    public static final String CHECKBOX_FOCUS_INPUT_MAP = "CheckBox.focusInputMap";
    public static final String CHECKBOX_FONT = "CheckBox.font";
    public static final String CHECKBOX_FOREGROUND = "CheckBox.foreground";
    public static final String CHECKBOX_GRADIENT = "CheckBox.gradient";
    public static final String CHECKBOX_ICON = "CheckBox.icon";
    public static final String CHECKBOX_MARGIN = "CheckBox.margin";
    public static final String CHECKBOX_ROLLOVER = "CheckBox.rollover";
    public static final String CHECKBOX_TEXT_ICON_GAP = "CheckBox.textIconGap";
    public static final String CHECKBOX_TEXT_SHIFT_OFFSET = "CheckBox.textShiftOffset";
    public static final String CHECKBOX_TOTAL_INSETS = "CheckBox.totalInsets";
    public static final String CHECKBOX_MENU_ITEM_ACCELERATOR_FONT = "CheckBoxMenuItem.acceleratorFont";
    public static final String CHECKBOX_MENU_ITEM_ACCELERATOR_FOREGROUND = "CheckBoxMenuItem.acceleratorForeground";
    public static final String CHECKBOX_MENU_ITEM_ACCELERATOR_SELECTION_FOREGROUND = "CheckBoxMenuItem.acceleratorSelectionForeground";
    public static final String CHECKBOX_MENU_ITEM_ARROW_ICON = "CheckBoxMenuItem.arrowIcon";
    public static final String CHECKBOX_MENU_ITEM_BACKGROUND = "CheckBoxMenuItem.background";
    public static final String CHECKBOX_MENU_ITEM_BORDER = "CheckBoxMenuItem.border";
    public static final String CHECKBOX_MENU_ITEM_BORDER_PAINTED = "CheckBoxMenuItem.borderPainted";
    public static final String CHECKBOX_MENU_ITEM_CHECK_ICON = "CheckBoxMenuItem.checkIcon";
    public static final String CHECKBOX_MENU_ITEM_COMMAND_SOUND = "CheckBoxMenuItem.commandSound";
    public static final String CHECKBOX_MENU_ITEM_DISABLED_FOREGROUND = "CheckBoxMenuItem.disabledForeground";
    public static final String CHECKBOX_MENU_ITEM_FONT = "CheckBoxMenuItem.font";
    public static final String CHECKBOX_MENU_ITEM_FOREGROUND = "CheckBoxMenuItem.foreground";
    public static final String CHECKBOX_MENU_ITEM_GRADIENT = "CheckBoxMenuItem.gradient";
    public static final String CHECKBOX_MENU_ITEM_MARGIN = "CheckBoxMenuItem.margin";
    public static final String CHECKBOX_MENU_ITEM_SELECTION_BACKGROUND = "CheckBoxMenuItem.selectionBackground";
    public static final String CHECKBOX_MENU_ITEM_SELECTION_FOREGROUND = "CheckBoxMenuItem.selectionForeground";
    public static final String CHECKBOX_MENU_ITEM_UI = "CheckBoxMenuItemUI";
    public static final String CHECKBOX_UI = "CheckBoxUI";
    public static final String COLOR_CHOOSER_BACKGROUND = "ColorChooser.background";
    public static final String COLOR_CHOOSER_FONT = "ColorChooser.font";
    public static final String COLOR_CHOOSER_FOREGROUND = "ColorChooser.foreground";
    public static final String COLOR_CHOOSER_SWATCHES_DEFAULT_RECENT_COLOR = "ColorChooser.swatchesDefaultRecentColor";
    public static final String COLOR_CHOOSER_SWATCHES_RECENT_SWATCH_SIZE = "ColorChooser.swatchesRecentSwatchSize";
    public static final String COLOR_CHOOSER_SWATCHES_SWATCH_SIZE = "ColorChooser.swatchesSwatchSize";
    public static final String COLOR_CHOOSER_UI = "ColorChooserUI";
    public static final String COMBO_BOX_ANCESTOR_INPUT_MAP = "ComboBox.ancestorInputMap";
    public static final String COMBO_BOX_BACKGROUND = "ComboBox.background";
    public static final String COMBO_BOX_BUTTON_BACKGROUND = "ComboBox.buttonBackground";
    public static final String COMBO_BOX_BUTTON_DARK_SHADOW = "ComboBox.buttonDarkShadow";
    public static final String COMBO_BOX_BUTTON_HIGHLIGHT = "ComboBox.buttonHighlight";
    public static final String COMBO_BOX_BUTTON_SHADOW = "ComboBox.buttonShadow";
    public static final String COMBO_BOX_DISABLED_BACKGROUND = "ComboBox.disabledBackground";
    public static final String COMBO_BOX_DISABLED_FOREGROUND = "ComboBox.disabledForeground";
    public static final String COMBO_BOX_FONT = "ComboBox.font";
    public static final String COMBO_BOX_FOREGROUND = "ComboBox.foreground";
    public static final String COMBO_BOX_IS_ENTER_SELECTABLE_POPUP = "ComboBox.isEnterSelectablePopup";
    public static final String COMBO_BOX_NO_ACTION_ON_KEY_NAVIGATION = "ComboBox.noActionOnKeyNavigation";
    public static final String COMBO_BOX_SELECTION_BACKGROUND = "ComboBox.selectionBackground";
    public static final String COMBO_BOX_SELECTION_FOREGROUND = "ComboBox.selectionForeground";
    public static final String COMBO_BOX_TIME_FACTOR = "ComboBox.timeFactor";
    public static final String COMBO_BOX_UI = "ComboBoxUI";
    public static final String DESKTOP_ANCESTOR_INPUT_MAP = "Desktop.ancestorInputMap";
    public static final String DESKTOP_BACKGROUND = "Desktop.background";
    public static final String DESKTOP_MIN_ON_SCREEN_INSETS = "Desktop.minOnScreenInsets";
    public static final String DESKTOP_ICON_BACKGROUND = "DesktopIcon.background";
    public static final String DESKTOP_ICON_BORDER = "DesktopIcon.border";
    public static final String DESKTOP_ICON_FONT = "DesktopIcon.font";
    public static final String DESKTOP_ICON_FOREGROUND = "DesktopIcon.foreground";
    public static final String DESKTOP_ICON_WIDTH = "DesktopIcon.width";
    public static final String DESKTOP_ICON_UI = "DesktopIconUI";
    public static final String DESKTOP_PANE_UI = "DesktopPaneUI";
    public static final String EDITOR_PANE_BACKGROUND = "EditorPane.background";
    public static final String EDITOR_PANE_BORDER = "EditorPane.border";
    public static final String EDITOR_PANE_CARET_BLINK_RATE = "EditorPane.caretBlinkRate";
    public static final String EDITOR_PANE_CARET_FOREGROUND = "EditorPane.caretForeground";
    public static final String EDITOR_PANE_FOCUS_INPUT_MAP = "EditorPane.focusInputMap";
    public static final String EDITOR_PANE_FONT = "EditorPane.font";
    public static final String EDITOR_PANE_FOREGROUND = "EditorPane.foreground";
    public static final String EDITOR_PANE_INACTIVE_FOREGROUND = "EditorPane.inactiveForeground";
    public static final String EDITOR_PANE_MARGIN = "EditorPane.margin";
    public static final String EDITOR_PANE_SELECTION_BACKGROUND = "EditorPane.selectionBackground";
    public static final String EDITOR_PANE_SELECTION_FOREGROUND = "EditorPane.selectionForeground";
    public static final String EDITOR_PANE_UI = "EditorPaneUI";
    public static final String FILE_CHOOSER_ANCESTOR_INPUT_MAP = "FileChooser.ancestorInputMap";
    public static final String FILE_CHOOSER_DETAILS_VIEW_ICON = "FileChooser.detailsViewIcon";
    public static final String FILE_CHOOSER_HOME_FOLDER_ICON = "FileChooser.homeFolderIcon";
    public static final String FILE_CHOOSER_LIST_VIEW_ICON = "FileChooser.listViewIcon";
    public static final String FILE_CHOOSER_NEW_FOLDER_ICON = "FileChooser.newFolderIcon";
    public static final String FILE_CHOOSER_READ_ONLY = "FileChooser.readOnly";
    public static final String FILE_CHOOSER_UP_FOLDER_ICON = "FileChooser.upFolderIcon";
    public static final String FILE_CHOOSER_USE_SYSTEM_EXTENSION_HIDING = "FileChooser.useSystemExtensionHiding";
    public static final String FILE_CHOOSER_USES_SINGLE_FILE_PANE = "FileChooser.usesSingleFilePane";
    public static final String FILE_CHOOSER_UI = "FileChooserUI";
    public static final String FILE_VIEW_COMPUTER_ICON = "FileView.computerIcon";
    public static final String FILE_VIEW_DIRECTORY_ICON = "FileView.directoryIcon";
    public static final String FILE_VIEW_FILE_ICON = "FileView.fileIcon";
    public static final String FILE_VIEW_FLOPPY_DRIVE_ICON = "FileView.floppyDriveIcon";
    public static final String FILE_VIEW_HARD_DRIVE_ICON = "FileView.hardDriveIcon";
    public static final String FORMATTED_TEXT_FIELD_BACKGROUND = "FormattedTextField.background";
    public static final String FORMATTED_TEXT_FIELD_BORDER = "FormattedTextField.border";
    public static final String FORMATTED_TEXT_FIELD_CARET_BLINK_RATE = "FormattedTextField.caretBlinkRate";
    public static final String FORMATTED_TEXT_FIELD_CARET_FOREGROUND = "FormattedTextField.caretForeground";
    public static final String FORMATTED_TEXT_FIELD_FOCUS_INPUT_MAP = "FormattedTextField.focusInputMap";
    public static final String FORMATTED_TEXT_FIELD_FONT = "FormattedTextField.font";
    public static final String FORMATTED_TEXT_FIELD_FOREGROUND = "FormattedTextField.foreground";
    public static final String FORMATTED_TEXT_FIELD_INACTIVE_BACKGROUND = "FormattedTextField.inactiveBackground";
    public static final String FORMATTED_TEXT_FIELD_INACTIVE_FOREGROUND = "FormattedTextField.inactiveForeground";
    public static final String FORMATTED_TEXT_FIELD_MARGIN = "FormattedTextField.margin";
    public static final String FORMATTED_TEXT_FIELD_SELECTION_BACKGROUND = "FormattedTextField.selectionBackground";
    public static final String FORMATTED_TEXT_FIELD_SELECTION_FOREGROUND = "FormattedTextField.selectionForeground";
    public static final String FORMATTED_TEXT_FIELD_UI = "FormattedTextFieldUI";
    public static final String INTERNAL_FRAME_ACTIVE_TITLE_BACKGROUND = "InternalFrame.activeTitleBackground";
    public static final String INTERNAL_FRAME_ACTIVE_TITLE_FOREGROUND = "InternalFrame.activeTitleForeground";
    public static final String INTERNAL_FRAME_ACTIVE_TITLE_GRADIENT = "InternalFrame.activeTitleGradient";
    public static final String INTERNAL_FRAME_BORDER = "InternalFrame.border";
    public static final String INTERNAL_FRAME_BORDER_COLOR = "InternalFrame.borderColor";
    public static final String INTERNAL_FRAME_BORDER_DARK_SHADOW = "InternalFrame.borderDarkShadow";
    public static final String INTERNAL_FRAME_BORDER_HIGHLIGHT = "InternalFrame.borderHighlight";
    public static final String INTERNAL_FRAME_BORDER_LIGHT = "InternalFrame.borderLight";
    public static final String INTERNAL_FRAME_BORDER_SHADOW = "InternalFrame.borderShadow";
    public static final String INTERNAL_FRAME_CLOSE_ICON = "InternalFrame.closeIcon";
    public static final String INTERNAL_FRAME_CLOSE_SOUND = "InternalFrame.closeSound";
    public static final String INTERNAL_FRAME_ICON = "InternalFrame.icon";
    public static final String INTERNAL_FRAME_ICONIFY_ICON = "InternalFrame.iconifyIcon";
    public static final String INTERNAL_FRAME_INACTIVE_TITLE_BACKGROUND = "InternalFrame.inactiveTitleBackground";
    public static final String INTERNAL_FRAME_INACTIVE_TITLE_FOREGROUND = "InternalFrame.inactiveTitleForeground";
    public static final String INTERNAL_FRAME_MAXIMIZE_ICON = "InternalFrame.maximizeIcon";
    public static final String INTERNAL_FRAME_MAXIMIZE_SOUND = "InternalFrame.maximizeSound";
    public static final String INTERNAL_FRAME_MINIMIZE_ICON = "InternalFrame.minimizeIcon";
    public static final String INTERNAL_FRAME_MINIMIZE_SOUND = "InternalFrame.minimizeSound";
    public static final String INTERNAL_FRAME_OPTION_DIALOG_BORDER = "InternalFrame.optionDialogBorder";
    public static final String INTERNAL_FRAME_PALETTE_BORDER = "InternalFrame.paletteBorder";
    public static final String INTERNAL_FRAME_PALETTE_CLOSE_ICON = "InternalFrame.paletteCloseIcon";
    public static final String INTERNAL_FRAME_PALETTE_TITLE_HEIGHT = "InternalFrame.paletteTitleHeight";
    public static final String INTERNAL_FRAME_RESTORE_DOWN_SOUND = "InternalFrame.restoreDownSound";
    public static final String INTERNAL_FRAME_RESTORE_UP_SOUND = "InternalFrame.restoreUpSound";
    public static final String INTERNAL_FRAME_TITLE_FONT = "InternalFrame.titleFont";
    public static final String INTERNAL_FRAME_TITLE_PANE_CLOSE_BUTTON_OPACITY = "InternalFrameTitlePane.closeButtonOpacity";
    public static final String INTERNAL_FRAME_TITLE_PANE_ICONIFY_BUTTON_OPACITY = "InternalFrameTitlePane.iconifyButtonOpacity";
    public static final String INTERNAL_FRAME_TITLE_PANE_MAXIMIZE_BUTTON_OPACITY = "InternalFrameTitlePane.maximizeButtonOpacity";
    public static final String INTERNAL_FRAME_UI = "InternalFrameUI";
    public static final String LABEL_BACKGROUND = "Label.background";
    public static final String LABEL_DISABLED_FOREGROUND = "Label.disabledForeground";
    public static final String LABEL_DISABLED_SHADOW = "Label.disabledShadow";
    public static final String LABEL_FONT = "Label.font";
    public static final String LABEL_FOREGROUND = "Label.foreground";
    public static final String LABEL_UI = "LabelUI";
    public static final String LIST_BACKGROUND = "List.background";
    public static final String LIST_CELL_RENDERER = "List.cellRenderer";
    public static final String LIST_DROP_CELL_BACKGROUND = "List.dropCellBackground";
    public static final String LIST_DROP_LINE_COLOR = "List.dropLineColor";
    public static final String LIST_FOCUS_CELL_HIGHLIGHT_BORDER = "List.focusCellHighlightBorder";
    public static final String LIST_FOCUS_INPUT_MAP = "List.focusInputMap";
    public static final String LIST_FOCUS_INPUT_MAP_RIGHT_TO_LEFT = "List.focusInputMap.RightToLeft";
    public static final String LIST_FONT = "List.font";
    public static final String LIST_FOREGROUND = "List.foreground";
    public static final String LIST_NO_FOCUS_BORDER = "List.noFocusBorder";
    public static final String LIST_SELECTION_BACKGROUND = "List.selectionBackground";
    public static final String LIST_SELECTION_FOREGROUND = "List.selectionForeground";
    public static final String LIST_TIME_FACTOR = "List.timeFactor";
    public static final String LIST_UI = "ListUI";
    public static final String MENU_ACCELERATOR_FONT = "Menu.acceleratorFont";
    public static final String MENU_ACCELERATOR_FOREGROUND = "Menu.acceleratorForeground";
    public static final String MENU_ACCELERATOR_SELECTION_FOREGROUND = "Menu.acceleratorSelectionForeground";
    public static final String MENU_ARROW_ICON = "Menu.arrowIcon";
    public static final String MENU_BACKGROUND = "Menu.background";
    public static final String MENU_BORDER = "Menu.border";
    public static final String MENU_BORDER_PAINTED = "Menu.borderPainted";
    public static final String MENU_CANCEL_MODE = "Menu.cancelMode";
    public static final String MENU_CHECK_ICON = "Menu.checkIcon";
    public static final String MENU_CROSS_MENU_MNEMONIC = "Menu.crossMenuMnemonic";
    public static final String MENU_DISABLED_FOREGROUND = "Menu.disabledForeground";
    public static final String MENU_FONT = "Menu.font";
    public static final String MENU_FOREGROUND = "Menu.foreground";
    public static final String MENU_MARGIN = "Menu.margin";
    public static final String MENU_MENU_POPUP_OFFSET_X = "Menu.menuPopupOffsetX";
    public static final String MENU_MENU_POPUP_OFFSET_Y = "Menu.menuPopupOffsetY";
    public static final String MENU_OPAQUE = "Menu.opaque";
    public static final String MENU_PRESERVE_TOP_LEVEL_SELECTION = "Menu.preserveTopLevelSelection";
    public static final String MENU_SELECTION_BACKGROUND = "Menu.selectionBackground";
    public static final String MENU_SELECTION_FOREGROUND = "Menu.selectionForeground";
    public static final String MENU_SHORTCUT_KEYS = "Menu.shortcutKeys";
    public static final String MENU_SUBMENU_POPUP_OFFSET_X = "Menu.submenuPopupOffsetX";
    public static final String MENU_SUBMENU_POPUP_OFFSET_Y = "Menu.submenuPopupOffsetY";
    public static final String MENU_BAR_BACKGROUND = "MenuBar.background";
    public static final String MENU_BAR_BORDER = "MenuBar.border";
    public static final String MENU_BAR_BORDER_COLOR = "MenuBar.borderColor";
    public static final String MENU_BAR_FONT = "MenuBar.font";
    public static final String MENU_BAR_FOREGROUND = "MenuBar.foreground";
    public static final String MENU_BAR_GRADIENT = "MenuBar.gradient";
    public static final String MENU_BAR_HIGHLIGHT = "MenuBar.highlight";
    public static final String MENU_BAR_SHADOW = "MenuBar.shadow";
    public static final String MENU_BAR_WINDOW_BINDINGS = "MenuBar.windowBindings";
    public static final String MENU_BAR_UI = "MenuBarUI";
    public static final String MENU_ITEM_ACCELERATOR_DELIMITER = "MenuItem.acceleratorDelimiter";
    public static final String MENU_ITEM_ACCELERATOR_FONT = "MenuItem.acceleratorFont";
    public static final String MENU_ITEM_ACCELERATOR_FOREGROUND = "MenuItem.acceleratorForeground";
    public static final String MENU_ITEM_ACCELERATOR_SELECTION_FOREGROUND = "MenuItem.acceleratorSelectionForeground";
    public static final String MENU_ITEM_ARROW_ICON = "MenuItem.arrowIcon";
    public static final String MENU_ITEM_BACKGROUND = "MenuItem.background";
    public static final String MENU_ITEM_BORDER = "MenuItem.border";
    public static final String MENU_ITEM_BORDER_PAINTED = "MenuItem.borderPainted";
    public static final String MENU_ITEM_CHECK_ICON = "MenuItem.checkIcon";
    public static final String MENU_ITEM_COMMAND_SOUND = "MenuItem.commandSound";
    public static final String MENU_ITEM_DISABLED_FOREGROUND = "MenuItem.disabledForeground";
    public static final String MENU_ITEM_FONT = "MenuItem.font";
    public static final String MENU_ITEM_FOREGROUND = "MenuItem.foreground";
    public static final String MENU_ITEM_MARGIN = "MenuItem.margin";
    public static final String MENU_ITEM_SELECTION_BACKGROUND = "MenuItem.selectionBackground";
    public static final String MENU_ITEM_SELECTION_FOREGROUND = "MenuItem.selectionForeground";
    public static final String MENU_ITEM_UI = "MenuItemUI";
    public static final String MENU_UI = "MenuUI";
    public static final String OPTION_PANE_BACKGROUND = "OptionPane.background";
    public static final String OPTION_PANE_BORDER = "OptionPane.border";
    public static final String OPTION_PANE_BUTTON_AREA_BORDER = "OptionPane.buttonAreaBorder";
    public static final String OPTION_PANE_BUTTON_CLICK_THRESHOLD = "OptionPane.buttonClickThreshold";
    public static final String OPTION_PANE_ERROR_DIALOG_BORDER = "OptionPane.errorDialog.border";
    public static final String OPTION_PANE_ERROR_DIALOG_TITLE_PANE_BACKGROUND = "OptionPane.errorDialog.titlePane.background";
    public static final String OPTION_PANE_ERROR_DIALOG_TITLE_PANE_FOREGROUND = "OptionPane.errorDialog.titlePane.foreground";
    public static final String OPTION_PANE_ERROR_DIALOG_TITLE_PANE_SHADOW = "OptionPane.errorDialog.titlePane.shadow";
    public static final String OPTION_PANE_ERROR_ICON = "OptionPane.errorIcon";
    public static final String OPTION_PANE_ERROR_SOUND = "OptionPane.errorSound";
    public static final String OPTION_PANE_FONT = "OptionPane.font";
    public static final String OPTION_PANE_FOREGROUND = "OptionPane.foreground";
    public static final String OPTION_PANE_INFORMATION_DIALOG_BORDER = "OptionPane.informationDialog.border";
    public static final String OPTION_PANE_INFORMATION_SOUND = "OptionPane.informationSound";
    public static final String OPTION_PANE_MESSAGE_AREA_BORDER = "OptionPane.messageAreaBorder";
    public static final String OPTION_PANE_MESSAGE_FOREGROUND = "OptionPane.messageForeground";
    public static final String OPTION_PANE_MINIMUM_SIZE = "OptionPane.minimumSize";
    public static final String OPTION_PANE_QUESTION_DIALOG_BORDER = "OptionPane.questionDialog.border";
    public static final String OPTION_PANE_QUESTION_DIALOG_TITLE_PANE_BACKGROUND = "OptionPane.questionDialog.titlePane.background";
    public static final String OPTION_PANE_QUESTION_DIALOG_TITLE_PANE_FOREGROUND = "OptionPane.questionDialog.titlePane.foreground";
    

AuditoryCues.allAuditoryCues
AuditoryCues.cueList
AuditoryCues.defaultCueList
AuditoryCues.noAuditoryCues
Button.background
Button.border
Button.darkShadow
Button.defaultButtonFollowsFocus
Button.disabledText
Button.disabledToolBarBorderBackground
Button.focus
Button.focusInputMap
Button.font
Button.foreground
Button.gradient
Button.highlight
Button.light
Button.margin
Button.rollover
Button.rolloverIconType
Button.select
Button.shadow
Button.textIconGap
Button.textShiftOffset
Button.toolBarBorderBackground
ButtonUI
CheckBox.background
CheckBox.border
CheckBox.disabledText
CheckBox.focus
CheckBox.focusInputMap
CheckBox.font
CheckBox.foreground
CheckBox.gradient
CheckBox.icon
CheckBox.margin
CheckBox.rollover
CheckBox.textIconGap
CheckBox.textShiftOffset
CheckBox.totalInsets
CheckBoxMenuItem.acceleratorFont
CheckBoxMenuItem.acceleratorForeground
CheckBoxMenuItem.acceleratorSelectionForeground
CheckBoxMenuItem.arrowIcon
CheckBoxMenuItem.background
CheckBoxMenuItem.border
CheckBoxMenuItem.borderPainted
CheckBoxMenuItem.checkIcon
CheckBoxMenuItem.commandSound
CheckBoxMenuItem.disabledForeground
CheckBoxMenuItem.font
CheckBoxMenuItem.foreground
CheckBoxMenuItem.gradient
CheckBoxMenuItem.margin
CheckBoxMenuItem.selectionBackground
CheckBoxMenuItem.selectionForeground
CheckBoxMenuItemUI
CheckBoxUI
Checkbox.select
ColorChooser.background
ColorChooser.font
ColorChooser.foreground
ColorChooser.swatchesDefaultRecentColor
ColorChooser.swatchesRecentSwatchSize
ColorChooser.swatchesSwatchSize
ColorChooserUI
ComboBox.ancestorInputMap
ComboBox.background
ComboBox.buttonBackground
ComboBox.buttonDarkShadow
ComboBox.buttonHighlight
ComboBox.buttonShadow
ComboBox.disabledBackground
ComboBox.disabledForeground
ComboBox.font
ComboBox.foreground
ComboBox.isEnterSelectablePopup
ComboBox.noActionOnKeyNavigation
ComboBox.selectionBackground
ComboBox.selectionForeground
ComboBox.timeFactor
ComboBoxUI
Desktop.ancestorInputMap
Desktop.background
Desktop.minOnScreenInsets
DesktopIcon.background
DesktopIcon.border
DesktopIcon.font
DesktopIcon.foreground
DesktopIcon.width
DesktopIconUI
DesktopPaneUI
EditorPane.background
EditorPane.border
EditorPane.caretBlinkRate
EditorPane.caretForeground
EditorPane.focusInputMap
EditorPane.font
EditorPane.foreground
EditorPane.inactiveForeground
EditorPane.margin
EditorPane.selectionBackground
EditorPane.selectionForeground
EditorPaneUI
FileChooser.ancestorInputMap
FileChooser.detailsViewIcon
FileChooser.homeFolderIcon
FileChooser.listViewIcon
FileChooser.newFolderIcon
FileChooser.readOnly
FileChooser.upFolderIcon
FileChooser.useSystemExtensionHiding
FileChooser.usesSingleFilePane
FileChooserUI
FileView.computerIcon
FileView.directoryIcon
FileView.fileIcon
FileView.floppyDriveIcon
FileView.hardDriveIcon
FormattedTextField.background
FormattedTextField.border
FormattedTextField.caretBlinkRate
FormattedTextField.caretForeground
FormattedTextField.focusInputMap
FormattedTextField.font
FormattedTextField.foreground
FormattedTextField.inactiveBackground
FormattedTextField.inactiveForeground
FormattedTextField.margin
FormattedTextField.selectionBackground
FormattedTextField.selectionForeground
FormattedTextFieldUI
InternalFrame.activeTitleBackground
InternalFrame.activeTitleForeground
InternalFrame.activeTitleGradient
InternalFrame.border
InternalFrame.borderColor
InternalFrame.borderDarkShadow
InternalFrame.borderHighlight
InternalFrame.borderLight
InternalFrame.borderShadow
InternalFrame.closeIcon
InternalFrame.closeSound
InternalFrame.icon
InternalFrame.iconifyIcon
InternalFrame.inactiveTitleBackground
InternalFrame.inactiveTitleForeground
InternalFrame.maximizeIcon
InternalFrame.maximizeSound
InternalFrame.minimizeIcon
InternalFrame.minimizeSound
InternalFrame.optionDialogBorder
InternalFrame.paletteBorder
InternalFrame.paletteCloseIcon
InternalFrame.paletteTitleHeight
InternalFrame.restoreDownSound
InternalFrame.restoreUpSound
InternalFrame.titleFont
InternalFrameTitlePane.closeButtonOpacity
InternalFrameTitlePane.iconifyButtonOpacity
InternalFrameTitlePane.maximizeButtonOpacity
InternalFrameUI
Label.background
Label.disabledForeground
Label.disabledShadow
Label.font
Label.foreground
LabelUI
List.background
List.cellRenderer
List.dropCellBackground
List.dropLineColor
List.focusCellHighlightBorder
List.focusInputMap
List.focusInputMap.RightToLeft
List.font
List.foreground
List.noFocusBorder
List.selectionBackground
List.selectionForeground
List.timeFactor
ListUI
Menu.acceleratorFont
Menu.acceleratorForeground
Menu.acceleratorSelectionForeground
Menu.arrowIcon
Menu.background
Menu.border
Menu.borderPainted
Menu.cancelMode
Menu.checkIcon
Menu.crossMenuMnemonic
Menu.disabledForeground
Menu.font
Menu.foreground
Menu.margin
Menu.menuPopupOffsetX
Menu.menuPopupOffsetY
Menu.opaque
Menu.preserveTopLevelSelection
Menu.selectionBackground
Menu.selectionForeground
Menu.shortcutKeys
Menu.submenuPopupOffsetX
Menu.submenuPopupOffsetY
MenuBar.background
MenuBar.border
MenuBar.borderColor
MenuBar.font
MenuBar.foreground
MenuBar.gradient
MenuBar.highlight
MenuBar.shadow
MenuBar.windowBindings
MenuBarUI
MenuItem.acceleratorDelimiter
MenuItem.acceleratorFont
MenuItem.acceleratorForeground
MenuItem.acceleratorSelectionForeground
MenuItem.arrowIcon
MenuItem.background
MenuItem.border
MenuItem.borderPainted
MenuItem.checkIcon
MenuItem.commandSound
MenuItem.disabledForeground
MenuItem.font
MenuItem.foreground
MenuItem.margin
MenuItem.selectionBackground
MenuItem.selectionForeground
MenuItemUI
MenuUI
OptionPane.background
OptionPane.border
OptionPane.buttonAreaBorder
OptionPane.buttonClickThreshhold
OptionPane.errorDialog.border.background
OptionPane.errorDialog.titlePane.background
OptionPane.errorDialog.titlePane.foreground
OptionPane.errorDialog.titlePane.shadow
OptionPane.errorIcon
OptionPane.errorSound
OptionPane.font
OptionPane.foreground
OptionPane.informationIcon
OptionPane.informationSound
OptionPane.messageAreaBorder
OptionPane.messageForeground
OptionPane.minimumSize
OptionPane.questionDialog.border.background
OptionPane.questionDialog.titlePane.background
OptionPane.questionDialog.titlePane.foreground
OptionPane.questionDialog.titlePane.shadow
OptionPane.questionIcon
OptionPane.questionSound
OptionPane.warningDialog.border.background
OptionPane.warningDialog.titlePane.background
OptionPane.warningDialog.titlePane.foreground
OptionPane.warningDialog.titlePane.shadow
OptionPane.warningIcon
OptionPane.warningSound
OptionPane.windowBindings
OptionPaneUI
Panel.background
Panel.font
Panel.foreground
PanelUI
PasswordField.background
PasswordField.border
PasswordField.caretBlinkRate
PasswordField.caretForeground
PasswordField.echoChar
PasswordField.focusInputMap
PasswordField.font
PasswordField.foreground
PasswordField.inactiveBackground
PasswordField.inactiveForeground
PasswordField.margin
PasswordField.selectionBackground
PasswordField.selectionForeground
PasswordFieldUI
PopupMenu.background
PopupMenu.border
PopupMenu.consumeEventOnClose
PopupMenu.font
PopupMenu.foreground
PopupMenu.popupSound
PopupMenu.selectedWindowInputMapBindings
PopupMenu.selectedWindowInputMapBindings.RightToLeft
PopupMenuSeparatorUI
PopupMenuUI
ProgressBar.background
ProgressBar.border
ProgressBar.cellLength
ProgressBar.cellSpacing
ProgressBar.cycleTime
ProgressBar.font
ProgressBar.foreground
ProgressBar.horizontalSize
ProgressBar.repaintInterval
ProgressBar.selectionBackground
ProgressBar.selectionForeground
ProgressBar.verticalSize
ProgressBarUI
RadioButton.background
RadioButton.border
RadioButton.darkShadow
RadioButton.disabledText
RadioButton.focus
RadioButton.focusInputMap
RadioButton.font
RadioButton.foreground
RadioButton.gradient
RadioButton.highlight
RadioButton.icon
RadioButton.light
RadioButton.margin
RadioButton.rollover
RadioButton.select
RadioButton.shadow
RadioButton.textIconGap
RadioButton.textShiftOffset
RadioButton.totalInsets
RadioButtonMenuItem.acceleratorFont
RadioButtonMenuItem.acceleratorForeground
RadioButtonMenuItem.acceleratorSelectionForeground
RadioButtonMenuItem.arrowIcon
RadioButtonMenuItem.background
RadioButtonMenuItem.border
RadioButtonMenuItem.borderPainted
RadioButtonMenuItem.checkIcon
RadioButtonMenuItem.commandSound
RadioButtonMenuItem.disabledForeground
RadioButtonMenuItem.font
RadioButtonMenuItem.foreground
RadioButtonMenuItem.gradient
RadioButtonMenuItem.margin
RadioButtonMenuItem.selectionBackground
RadioButtonMenuItem.selectionForeground
RadioButtonMenuItemUI
RadioButtonUI
RootPane.ancestorInputMap
RootPane.colorChooserDialogBorder
RootPane.defaultButtonWindowKeyBindings
RootPane.errorDialogBorder
RootPane.fileChooserDialogBorder
RootPane.frameBorder
RootPane.informationDialogBorder
RootPane.plainDialogBorder
RootPane.questionDialogBorder
RootPane.warningDialogBorder
RootPaneUI
ScrollBar.allowsAbsolutePositioning
ScrollBar.ancestorInputMap
ScrollBar.ancestorInputMap.RightToLeft
ScrollBar.background
ScrollBar.darkShadow
ScrollBar.foreground
ScrollBar.gradient
ScrollBar.highlight
ScrollBar.maximumThumbSize
ScrollBar.minimumThumbSize
ScrollBar.shadow
ScrollBar.thumb
ScrollBar.thumbDarkShadow
ScrollBar.thumbHighlight
ScrollBar.thumbShadow
ScrollBar.track
ScrollBar.trackHighlight
ScrollBar.width
ScrollBarUI
ScrollPane.ancestorInputMap
ScrollPane.ancestorInputMap.RightToLeft
ScrollPane.background
ScrollPane.border
ScrollPane.font
ScrollPane.foreground
ScrollPaneUI
Separator.background
Separator.foreground
Separator.highlight
Separator.shadow
SeparatorUI
Slider.altTrackColor
Slider.background
Slider.focus
Slider.focusGradient
Slider.focusInputMap
Slider.focusInputMap.RightToLeft
Slider.focusInsets
Slider.font
Slider.foreground
Slider.gradient
Slider.highlight
Slider.horizontalSize
Slider.horizontalThumbIcon
Slider.majorTickLength
Slider.minimumHorizontalSize
Slider.minimumVerticalSize
Slider.onlyLeftMouseButtonDrag
Slider.shadow
Slider.tickColor
Slider.trackWidth
Slider.verticalSize
Slider.verticalThumbIcon
SliderUI
Spinner.ancestorInputMap
Spinner.arrowButtonBorder
Spinner.arrowButtonInsets
Spinner.arrowButtonSize
Spinner.background
Spinner.border
Spinner.editorAlignment
Spinner.editorBorderPainted
Spinner.font
Spinner.foreground
SpinnerUI
SplitPane.ancestorInputMap
SplitPane.background
SplitPane.border
SplitPane.centerOneTouchButtons
SplitPane.darkShadow
SplitPane.dividerFocusColor
SplitPane.dividerSize
SplitPane.highlight
SplitPane.oneTouchButtonsOpaque
SplitPane.shadow
SplitPaneDivider.border
SplitPaneDivider.draggingColor
SplitPaneUI
TabbedPane.ancestorInputMap
TabbedPane.background
TabbedPane.borderHightlightColor
TabbedPane.contentAreaColor
TabbedPane.contentBorderInsets
TabbedPane.contentOpaque
TabbedPane.darkShadow
TabbedPane.focus
TabbedPane.focusInputMap
TabbedPane.font
TabbedPane.foreground
TabbedPane.highlight
TabbedPane.labelShift
TabbedPane.light
TabbedPane.selectHighlight
TabbedPane.selected
TabbedPane.selectedLabelShift
TabbedPane.selectedTabPadInsets
TabbedPane.selectionFollowsFocus
TabbedPane.shadow
TabbedPane.tabAreaBackground
TabbedPane.tabAreaInsets
TabbedPane.tabInsets
TabbedPane.tabRunOverlay
TabbedPane.tabsOpaque
TabbedPane.tabsOverlapBorder
TabbedPane.textIconGap
TabbedPane.unselectedBackground
TabbedPaneUI
Table.ancestorInputMap
Table.ancestorInputMap.RightToLeft
Table.ascendingSortIcon
Table.background
Table.descendingSortIcon
Table.dropCellBackground
Table.dropLineColor
Table.dropLineShortColor
Table.focusCellBackground
Table.focusCellForeground
Table.focusCellHighlightBorder
Table.font
Table.foreground
Table.gridColor
Table.scrollPaneBorder
Table.selectionBackground
Table.selectionForeground
Table.sortIconColor
TableHeader.ancestorInputMap
TableHeader.background
TableHeader.cellBorder
TableHeader.focusCellBackground
TableHeader.font
TableHeader.foreground
TableHeaderUI
TableUI
Text-specific antialiasing enable key
TextArea.background
TextArea.border
TextArea.caretBlinkRate
TextArea.caretForeground
TextArea.focusInputMap
TextArea.font
TextArea.foreground
TextArea.inactiveForeground
TextArea.margin
TextArea.selectionBackground
TextArea.selectionForeground
TextAreaUI
TextField.background
TextField.border
TextField.caretBlinkRate
TextField.caretForeground
TextField.darkShadow
TextField.focusInputMap
TextField.font
TextField.foreground
TextField.highlight
TextField.inactiveBackground
TextField.inactiveForeground
TextField.light
TextField.margin
TextField.selectionBackground
TextField.selectionForeground
TextField.shadow
TextFieldUI
TextPane.background
TextPane.border
TextPane.caretBlinkRate
TextPane.caretForeground
TextPane.focusInputMap
TextPane.font
TextPane.foreground
TextPane.inactiveForeground
TextPane.margin
TextPane.selectionBackground
TextPane.selectionForeground
TextPaneUI
TitledBorder.border
TitledBorder.font
TitledBorder.titleColor
ToggleButton.background
ToggleButton.border
ToggleButton.darkShadow
ToggleButton.disabledText
ToggleButton.focus
ToggleButton.focusInputMap
ToggleButton.font
ToggleButton.foreground
ToggleButton.gradient
ToggleButton.highlight
ToggleButton.light
ToggleButton.margin
ToggleButton.select
ToggleButton.shadow
ToggleButton.textIconGap
ToggleButton.textShiftOffset
ToggleButtonUI
ToolBar.ancestorInputMap
ToolBar.background
ToolBar.border
ToolBar.borderColor
ToolBar.darkShadow
ToolBar.dockingBackground
ToolBar.dockingForeground
ToolBar.floatingBackground
ToolBar.floatingForeground
ToolBar.font
ToolBar.foreground
ToolBar.highlight
ToolBar.isRollover
ToolBar.light
ToolBar.nonrolloverBorder
ToolBar.rolloverBorder
ToolBar.separatorSize
ToolBar.shadow
ToolBarSeparatorUI
ToolBarUI
ToolTip.background
ToolTip.backgroundInactive
ToolTip.border
ToolTip.borderInactive
ToolTip.font
ToolTip.foreground
ToolTip.foregroundInactive
ToolTip.hideAccelerator
ToolTipManager.enableToolTipMode
ToolTipUI
Tree.ancestorInputMap
Tree.background
Tree.changeSelectionWithFocus
Tree.closedIcon
Tree.collapsedIcon
Tree.drawsFocusBorderAroundIcon
Tree.dropCellBackground
Tree.dropLineColor
Tree.editorBorder
Tree.expandedIcon
Tree.focusInputMap
Tree.focusInputMap.RightToLeft
Tree.font
Tree.foreground
Tree.hash
Tree.leafIcon
Tree.leftChildIndent
Tree.line
Tree.lineTypeDashed
Tree.openIcon
Tree.paintLines
Tree.rightChildIndent
Tree.rowHeight
Tree.scrollsOnExpand
Tree.selectionBackground
Tree.selectionBorderColor
Tree.selectionForeground
Tree.textBackground
Tree.textForeground
Tree.timeFactor
TreeUI
Viewport.background
Viewport.font
Viewport.foreground
ViewportUI
activeCaption
activeCaptionBorder
activeCaptionText
control
controlDkShadow
controlHighlight
controlLtHighlight
controlShadow
controlText
desktop
html.missingImage
html.pendingImage
inactiveCaption
inactiveCaptionBorder
inactiveCaptionText
info
infoText
menu
menuText
scrollbar
text
textHighlight
textHighlightText
textInactiveText
textText
window
    
}
