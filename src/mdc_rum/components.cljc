(ns mdc-rum.components
  (:require [rum.core :as rum]
            [mdc-rum.core :as mdc]
            [mdc-rum.mixins :as mixins]))

(rum/defc textfield < mixins/attach-textfield rum/static
  [opts input-name label]
  (let [id (keyword (str (name input-name) "-input"))]
    [:div.mdc-textfield
     [:input.mdc-textfield__input (merge {:id id :name input-name} opts)]
     [:label.mdc-textfield__label {:for input-name} label]]))


(rum/defc textfield-multiline < mixins/attach-textfield rum/static
  [opts input-name label]
  (let [id (keyword (str (name input-name) "-multiline"))]
    [:div.mdc-textfield.mdc-textfield--multiline
      [:textarea.mdc-textfield__input (merge {:id id :name input-name :rows 12 :cols 60} opts)]
      [:label.mdc-textfield__label {:for input-name} label]]))


(rum/defc dialog-primary-button < mixins/attach-ripple rum/static
  [opts label]
  [:button.mdc-button.mdc-button__dialog__footer_button.mdc-button--primary.mdc-button--accent opts label])


(rum/defc dialog-button < mixins/attach-ripple rum/static
  [opts label]
  [:button.mdc-button.mdc-button__dialog__footer_button opts label])


(rum/defc primary-button < mixins/attach-ripple rum/static
  [opts label]
  [:button.mdc-button.mdc-button--primary opts label])


(rum/defc button < mixins/attach-ripple rum/static
  [opts label]
  [:button.mdc-button opts label])

(rum/defc link-button < mixins/attach-ripple rum/static
  [opts label]
  [:a.mdc-button opts label])

(rum/defc primary-link-button < mixins/attach-ripple rum/static
  [opts label]
  [:a.mdc-button.mdc-button--primary opts label])

(rum/defc dense-link-button < mixins/attach-ripple rum/static
  [opts label]
  [:a.mdc-button.mdc-button--dense opts label])

(rum/defc dense-button < mixins/attach-ripple rum/static
  [opts label]
  [:button.mdc-button.mdc-button--dense opts label])

(rum/defc dense-primary-button < mixins/attach-ripple rum/static
  [opts label]
  [:button.mdc-button.mdc-button--dense.mdc-button--primary opts label])

(rum/defc card-button < mixins/attach-ripple rum/static
  [opts label]
  [:button.mdc-button.mdc-button--compact.mdc-card__action.mdc-button--primary opts label])

(rum/defc card-link < mixins/attach-ripple rum/static
  [opts label]
  [:a.mdc-button.mdc-button--compact.mdc-card__action opts label])

(rum/defc icon-button < mixins/attach-ripple rum/static
  [opts label]
  [mdc/icon-link opts label])

(rum/defcc checkbox
  [opts]
  [:div.mdc-checkbox
   [:input.mdc-checkbox__native-control opts]
   [:div.mdc-checkbox__background
    [:svg.mdc-checkbox__checkmark
     {:view-box "0 0 24 24"}
     [:path.mdc-checkbox__checkmark__path
      {:fill "none"
       :stroke "white"
       :d "M1.73,12.91 8.1,19.28 22.79,4.59"}]]]])



