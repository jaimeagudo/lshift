(ns lshift.main
  (:gen-class))

(defn population_count 
  "Takes a non-negative integer and returns the number of '1' bits
   set in the binary representation of that integer."
  [n]
  (let [MAX_BITS 32]
  (count (filter true? (map #(bit-test n %) (range 0 MAX_BITS))))))


(defn -main 
  "Population count example"
  [& args]
  (println "Starting...")
  (doall (map #(println "(population_count" % ") = "  (population_count %)) '(0 8 15 19))))
