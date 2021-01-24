package visual_interfaces.web.htmlComponents

import visual_interfaces.web.htmlComponents.SimpleHTML.setStyles
import visual_interfaces.web.htmlComponents.componentClasses.hiddenExpenses.hiddenExpenseColumn
import visual_interfaces.web.htmlComponents.componentClasses.hiddenExpenses.hiddenExpenseColumnSpans
import visual_interfaces.web.htmlComponents.componentClasses.hiddenExpenses.hiddenExpenseRootContainer
import visual_interfaces.web.htmlComponents.componentClasses.mainPage.mainBodyWrapper
import visual_interfaces.web.htmlComponents.componentClasses.mainTransaction.mainTransactionWindow
import visual_interfaces.web.htmlComponents.componentClasses.mainTransaction.transactionRowsGridItem
import visual_interfaces.web.htmlComponents.componentClasses.mainTransaction.transactionRowsGridParent
import visual_interfaces.web.htmlComponents.componentClasses.transactionInput.container.vertical
import visual_interfaces.web.htmlComponents.componentClasses.transactionInput.transactionInputBox
import visual_interfaces.web.htmlComponents.componentClasses.transactionInput.transactionInputRepeatedCountInput
import kotlinx.css.*
import kotlinx.css.Float


object componentClasses {
    
    object mainPage {
        val mainBodyWrapper = "main-page-body-wrapper"
    }
    
    object transactionInput {
        object container {
            val vertical = "transaction-input-container-vertical"
            val horizontal = "transaction-input-container-vertical"
        }
        
        val transactionInputBox = "transaction-input-box"
        val transactionInputRepeatedCountInput = "transaction-input-repeated-count-input"
        val transactionInputRepeatedDayGroupOption = "transaction-input-repeated-daygroup-option"
        val transactionInputRepeatedDayGroupSelection = "transaction-input-repeated-daygroup-selection"
    }
    
    object mainTransaction {
        val mainTransactionWindow = "main-transaction-window"
        val transactionRowsGridParent = "transaction-row-info-grid"
        val transactionRowsGridItem = "transaction-row-info-grid-item"
    }
    
    object hiddenExpenses {
        val hiddenExpenseRootContainer = "hidden-expense-root-container"
        val hiddenExpenseDataRow = "hidden-expense-row"
        val hiddenExpenseColumn = "hidden-expense-column"
        val hiddenExpenseColumnSpans = "hidden-expense-column span"
    }
}

object namedRules {
    val clearfix = ".clearfix::after"
}

fun CSSBuilder.addClass(
    name: String,
    block: RuleSet
) = rule(".$name", block)

fun SimpleHTML.Html.setGlobalStyles() {
    setStyles {
        rule(namedRules.clearfix) {
            content = QuotedString("")
            clear = Clear.both
            display = Display.table
        }
    
        // -- Media --
        rule("@media only screen and (max-width: 800px)") {
            addClass(vertical) {
                declarations["order"] = -1
                width = 100.pct
            }
        }
    
        // -----------------------------
        // Duh bawdee
        // -----------------------------
        addClass(mainBodyWrapper) {
            display = Display.flex
            flexWrap = FlexWrap.wrap
        }
    }
}
