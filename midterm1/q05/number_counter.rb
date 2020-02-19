def occurences_of_each_number(string)
    return Hash.new if string.empty?

    map = Hash.new
    string.each_char { |n|
        map[n] = (map[n] || 0) + 1
    }
    return map
end

puts occurences_of_each_number("087237913776829423439457956")
puts occurences_of_each_number("56876443467899987643322")
puts occurences_of_each_number("69742234677888888765543322222111")