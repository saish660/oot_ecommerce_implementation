class Cart:
    def __init__(self):
        self.products = []
        self.total_price = 0

    def add_item(self, newItem):
        try:
            self.products.append(newItem)
            return True
        except Exception:
            return False

    def remove_item(self, item):
        return True

    def create_order(self):
        return True

    def get_products(self):
        return self.products

    def get_total(self):
        return self.total_price


class Order:
    def __init__(self):
        self.order_id = ""
        self.item_count = 0
        self.total_price = 0
        self.order_date = 0
        self.order_status = ""
        self.order_items = []

    def place_order(self):
        return True

    def cancel_order(self):
        return True

    def add_order_item(self, product_id):
        try:
            self.order_items.append(product_id)
            return True
        except Exception:
            return False

    def set_order_date(self, order_date):
        try:
            self.order_date = order_date
            return True
        except Exception:
            return False

    def set_order_status(self, new_status):
        try:
            self.order_status = new_status
            return True
        except Exception:
            return False

    def get_status(self):
        return self.order_status

    def get_total_price(self):
        return self.total_price

    def get_order_date(self):
        return self.order_date

    def get_order_items(self):
        return self.order_items

    def get_order_id(self):
        return self.order_id


class Review:
    def __init__(self):
        self.user_id = 0
        self.review_title = ""
        self.review_text = ""
        self.seller_reply = ""
        self.media_src = []

    def set_review(self, review_title, review_text):
        try:
            self.review_title = review_title
            self.review_text = review_text
            return 1
        except Exception:
            return 0

    def add_media(self):
        return True

    def set_seller_reply(self, reply):
        try:
            self.seller_reply = reply
            return True
        except Exception:
            return False

    def get_review_title(self):
        return self.review_title

    def get_review_text(self):
        return self.review_text

    def get_seller_reply(self):
        return self.seller_reply


class Sale:
    def __init__(self):
        self.name = ""
        self.description = ""
        self.offers = []
        self.start_date = ""
        self.duration_hours = 0.0

    def launch_sale(self):
        return True

    def stop_sale(self):
        return True

    def add_offer(self, offer):
        try:
            self.offers.append(offer)
            return True
        except Exception:
            return False

    def remove_offer(self, offer):
        return True

    def get_duration(self):
        return self.duration_hours

    def set_start_date(self, date):
        try:
            self.start_date = date
            return True
        except Exception:
            return False


class Advertisement:
    def __init__(self):
        self.product_id = ""
        self.category = ""
        self.ad_balance = 0.0
        self.ad_media_src = []

    def set_balance(self):
        import random
        return int(random.random() * 100)

    def set_category(self, category):
        try:
            self.category = category
            return 1
        except Exception:
            return 0

    def add_media(self, newMediaList):
        return 1

    def get_productId(self):
        return self.product_id

    def get_category(self):
        return self.category

    def get_adBalance(self):
        return self.ad_balance
