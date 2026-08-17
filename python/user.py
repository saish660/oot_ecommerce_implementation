class User:
    def __init__(self, user_id=0, email="", ph_no="", password=""):
        self._user_id = user_id
        self._email = email
        self._ph_no = ph_no
        self._password = password

    def register(self, uid, email, ph_no, passwd):
        self._user_id = uid
        self._email = email
        self._ph_no = ph_no
        self._password = passwd

        return True

    def login(self, uid, passwd):
        return True

    @property
    def email(self):
        return self._email

    @email.setter
    def email(self, new_email):
        self._email = new_email

    @property
    def ph_no(self):
        return self._ph_no

    @ph_no.setter
    def ph_no(self, new_ph_no):
        self._ph_no = new_ph_no

    @property
    def user_id(self):
        return self._user_id

    @user_id.setter
    def user_id(self, newid):
        self._user_id = newid

    @property
    def password(self):
        return self._password

    @password.setter
    def password(self, new_pass):
        self._password = new_pass


class Buyer(User):
    def __init__(self, address="", name="", payment_options=[]):
        self._address = address
        self.name = name
        self._