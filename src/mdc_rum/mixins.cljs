(ns mdc-rum.mixins
  (:require [rum.core :as rum]))


(def attach-textfield
  {:did-mount (fn [state]
                (-> state rum/dom-node js/mdc.textfield.MDCTextfield.attachTo)
                state)})


(def ^:private attach-ripple
  {:did-mount (fn [state]
                (-> state rum/dom-node js/mdc.ripple.MDCRipple.attachTo)
                state)})


(def attach-dialog
  {:did-mount
   (fn [state]
     (-> state rum/dom-node js/mdc.dialog.MDCDialog.attachTo)
     state)})


(def init-tab-bar
  {:did-mount
   (fn [state props]
     (-> state rum/dom-node js/mdc.tabs.MDCTabBar.attachTo)
     state)})
