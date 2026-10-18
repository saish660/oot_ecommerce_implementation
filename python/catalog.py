class Product:
    def __init__(self):
        self.product_id = ""
        self.name = ""
        self.description = ""
        self.price = 0
        self.discount = 0
        self.image_src = []
        self.rating = 0.0
        self.stock = 0

    def update_stock(self):
        return True

    def get_details(self):
        print("ProductId: " + self.product_id + "\nName: " + self.name + "\nDescription: "
              + self.description + "\nPrice: " + str(self.price) + "\nDiscount: "
              + str(self.discount) + "\nRatings: " + str(self.rating))

    def get_product_id(self):
        return self.product_id

    def get_product_name(self):
        return self.name

    def get_product_description(self):
        return self.description

    def get_product_price(self):
        return self.price

    def get_product_discount(self):
        return self.discount

    def get_product_rating(self):
        return self.rating

    def set_product_name(self, newName):
        try:
            self.name = newName
            return True
        except Exception:
            return False

    def set_product_description(self, newDescription):
        try:
            self.description = newDescription
            return True
        except Exception:
            return False

    def set_price(self, newPrice):
        try:
            self.price = newPrice
            return True
        except Exception:
            return False

    def set_discount(self, newDiscount):
        try:
            self.discount = newDiscount
            return True
        except Exception:
            return False


class Wishlist:
    def __init__(self):
        self.name = ""
        self.item_count = 0
        self.wishlisted_items = []

    def get_wishlist(self):
        return self.wishlisted_items

    def add_item(self, newItem):
        try:
            self.wishlisted_items.append(newItem)
            return True
        except Exception:
            return False

    def set_name(self, name):
        try:
            self.name = name
            return True
        except Exception:
            return False

    def get_name(self):
        return self.name
