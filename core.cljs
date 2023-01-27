(ns core
  (:require [goog.string]
            [markdown.core :as md]))

(md/md-to-html-string "#Hello")
