class NamesComputer

    def average_length_functional(names)
        names.empty? ? 0 : names.sum(&:length) / names.size.to_f
    end
  
    def names_starting_with_each_letter_functional(names)
        names.empty? ?
            Hash.new :
            names.group_by{|name| name.chr}.map{|initial, namelist| [initial,namelist.count]}.to_h
    end

    def average_length_imperative(names)
        return 0.0 if names.empty?

        total = 0.0
        for name in names
            total += name.length
        end

        return total / names.length
    end
      
    def names_starting_with_each_letter_imperative(names)
        return Hash.new if names.empty?

        map = Hash.new
        for name in names
            map[name.chr] = (map[name.chr] || 0) + 1
        end

        return map
    end
end