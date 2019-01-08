(ns app.shadow
  (:require
   ["single-spa-react" :as spa-react]
   ["react" :as react]
   ["react-dom" :as react-dom]
   [app.core :refer [main]]))

(defn promisify
  [f]
  (js/Promise. (fn [resolve]
                 (f)
                 (resolve))))

(defn ^:export bootstrap  [] (promisify #(js/console.log "hello")))

(defn ^:export mount []
  (promisify main))

(defn ^:export unmount [] (promisify #(js/console.log "hello")))
