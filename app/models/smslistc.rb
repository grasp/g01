 # coding: utf-8
class Smslistc
   include Mongoid::Document
   include Mongoid::Timestamps
 
     field :phone, :type=>String
     field :cargolist, :type=>Array
    # index :phone, unique: true
     index({ phone: 1 },{ unique: true })
end
