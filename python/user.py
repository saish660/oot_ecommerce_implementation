class User:
    def __init__(self):
        self.user_id = 0
        self.email = ""
        self.ph_no = ""
        self.password = ""

    def register(self, uid, email, ph_no, passwd):
        try:
            self.user_id = uid
            self.email = email
            self.ph_no = ph_no
            self.password = passwd
            return True
        except Exception:
            return False

    def set_uid(self, uid):
        try:
            self.user_id = uid
            return True
        except Exception:
            return False

    def set_email(self, email):
        try:
            self.email = email
            return True
        except Exception:
            return False

    def set_ph_no(self, ph_no):
        try:
            self.ph_no = ph_no
            return True
        except Exception:
            return False

    def set_passwd(self, passwd):
        try:
            self.password = passwd
            return True
        except Exception:
            return False

    def login(self, uid, passwd):
        return True

    def get_user_email(self):
        return self.email

    def get_ph_no(self):
        return self.ph_no


class Buyer(User):
    def __init__(self):
        super().__init__()
        self.address = ""
        self.name = ""
        self.paymentOptions = []

    def set_details(self, uid, email, ph_no):
        try:
            self.user_id = uid
            self.email = email
            self.ph_no = ph_no
            return True
        except Exception:
            return False

    def set_address(self, address):
        try:
            self.address = address
            return True
        except Exception:
            return False

    def set_name(self, name):
        try:
            self.name = name
            return True
        except Exception:
            return False

    def add_payment_option(self, payment_method):
        try:
            self.paymentOptions.append(payment_method)
            return True
        except Exception:
            return False

    def place_order(self):
        return True

    def get_cart(self):
        return [1, 2]

    def getName(self):
        return self.name

    def getAddress(self):
        return self.address


class Seller(User):
    def __init__(self):
        super().__init__()
        self.seller_id = ""
        self.seller_name = ""
        self.avg_rating = 0.0
        self.location = ""
        self.products = []

    def set_details(self, email, ph_no, seller_name, location):
        try:
            self.email = email
            self.ph_no = ph_no
            self.seller_name = seller_name
            self.location = location
            return True
        except Exception:
            return False

    def set_location(self, newLocation):
        try:
            self.location = newLocation
            return True
        except Exception:
            return False

    def get_products(self):
        return ["product1", "product2"]

    def get_location(self):
        return self.location

    def get_seller_id(self):
        return self.seller_id

    def get_seller_name(self):
        return self.seller_name
