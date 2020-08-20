package com.macro.mall.model;

import java.util.ArrayList;
import java.util.List;

public class TSportPosExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSportPosExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPosIdIsNull() {
            addCriterion("POS_ID is null");
            return (Criteria) this;
        }

        public Criteria andPosIdIsNotNull() {
            addCriterion("POS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPosIdEqualTo(String value) {
            addCriterion("POS_ID =", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdNotEqualTo(String value) {
            addCriterion("POS_ID <>", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdGreaterThan(String value) {
            addCriterion("POS_ID >", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdGreaterThanOrEqualTo(String value) {
            addCriterion("POS_ID >=", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdLessThan(String value) {
            addCriterion("POS_ID <", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdLessThanOrEqualTo(String value) {
            addCriterion("POS_ID <=", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdLike(String value) {
            addCriterion("POS_ID like", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdNotLike(String value) {
            addCriterion("POS_ID not like", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdIn(List<String> values) {
            addCriterion("POS_ID in", values, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdNotIn(List<String> values) {
            addCriterion("POS_ID not in", values, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdBetween(String value1, String value2) {
            addCriterion("POS_ID between", value1, value2, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdNotBetween(String value1, String value2) {
            addCriterion("POS_ID not between", value1, value2, "posId");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("CHANNEL =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("CHANNEL <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("CHANNEL >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("CHANNEL <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("CHANNEL like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("CHANNEL not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("CHANNEL in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("CHANNEL not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("CHANNEL between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("CHANNEL not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressIsNull() {
            addCriterion("REGISTER_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressIsNotNull() {
            addCriterion("REGISTER_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressEqualTo(String value) {
            addCriterion("REGISTER_ADDRESS =", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressNotEqualTo(String value) {
            addCriterion("REGISTER_ADDRESS <>", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressGreaterThan(String value) {
            addCriterion("REGISTER_ADDRESS >", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTER_ADDRESS >=", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressLessThan(String value) {
            addCriterion("REGISTER_ADDRESS <", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressLessThanOrEqualTo(String value) {
            addCriterion("REGISTER_ADDRESS <=", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressLike(String value) {
            addCriterion("REGISTER_ADDRESS like", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressNotLike(String value) {
            addCriterion("REGISTER_ADDRESS not like", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressIn(List<String> values) {
            addCriterion("REGISTER_ADDRESS in", values, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressNotIn(List<String> values) {
            addCriterion("REGISTER_ADDRESS not in", values, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressBetween(String value1, String value2) {
            addCriterion("REGISTER_ADDRESS between", value1, value2, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressNotBetween(String value1, String value2) {
            addCriterion("REGISTER_ADDRESS not between", value1, value2, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyBusineIsNull() {
            addCriterion("COMPANY_BUSINE is null");
            return (Criteria) this;
        }

        public Criteria andCompanyBusineIsNotNull() {
            addCriterion("COMPANY_BUSINE is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyBusineEqualTo(String value) {
            addCriterion("COMPANY_BUSINE =", value, "companyBusine");
            return (Criteria) this;
        }

        public Criteria andCompanyBusineNotEqualTo(String value) {
            addCriterion("COMPANY_BUSINE <>", value, "companyBusine");
            return (Criteria) this;
        }

        public Criteria andCompanyBusineGreaterThan(String value) {
            addCriterion("COMPANY_BUSINE >", value, "companyBusine");
            return (Criteria) this;
        }

        public Criteria andCompanyBusineGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_BUSINE >=", value, "companyBusine");
            return (Criteria) this;
        }

        public Criteria andCompanyBusineLessThan(String value) {
            addCriterion("COMPANY_BUSINE <", value, "companyBusine");
            return (Criteria) this;
        }

        public Criteria andCompanyBusineLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_BUSINE <=", value, "companyBusine");
            return (Criteria) this;
        }

        public Criteria andCompanyBusineLike(String value) {
            addCriterion("COMPANY_BUSINE like", value, "companyBusine");
            return (Criteria) this;
        }

        public Criteria andCompanyBusineNotLike(String value) {
            addCriterion("COMPANY_BUSINE not like", value, "companyBusine");
            return (Criteria) this;
        }

        public Criteria andCompanyBusineIn(List<String> values) {
            addCriterion("COMPANY_BUSINE in", values, "companyBusine");
            return (Criteria) this;
        }

        public Criteria andCompanyBusineNotIn(List<String> values) {
            addCriterion("COMPANY_BUSINE not in", values, "companyBusine");
            return (Criteria) this;
        }

        public Criteria andCompanyBusineBetween(String value1, String value2) {
            addCriterion("COMPANY_BUSINE between", value1, value2, "companyBusine");
            return (Criteria) this;
        }

        public Criteria andCompanyBusineNotBetween(String value1, String value2) {
            addCriterion("COMPANY_BUSINE not between", value1, value2, "companyBusine");
            return (Criteria) this;
        }

        public Criteria andAccountCardIsNull() {
            addCriterion("ACCOUNT_CARD is null");
            return (Criteria) this;
        }

        public Criteria andAccountCardIsNotNull() {
            addCriterion("ACCOUNT_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andAccountCardEqualTo(String value) {
            addCriterion("ACCOUNT_CARD =", value, "accountCard");
            return (Criteria) this;
        }

        public Criteria andAccountCardNotEqualTo(String value) {
            addCriterion("ACCOUNT_CARD <>", value, "accountCard");
            return (Criteria) this;
        }

        public Criteria andAccountCardGreaterThan(String value) {
            addCriterion("ACCOUNT_CARD >", value, "accountCard");
            return (Criteria) this;
        }

        public Criteria andAccountCardGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_CARD >=", value, "accountCard");
            return (Criteria) this;
        }

        public Criteria andAccountCardLessThan(String value) {
            addCriterion("ACCOUNT_CARD <", value, "accountCard");
            return (Criteria) this;
        }

        public Criteria andAccountCardLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_CARD <=", value, "accountCard");
            return (Criteria) this;
        }

        public Criteria andAccountCardLike(String value) {
            addCriterion("ACCOUNT_CARD like", value, "accountCard");
            return (Criteria) this;
        }

        public Criteria andAccountCardNotLike(String value) {
            addCriterion("ACCOUNT_CARD not like", value, "accountCard");
            return (Criteria) this;
        }

        public Criteria andAccountCardIn(List<String> values) {
            addCriterion("ACCOUNT_CARD in", values, "accountCard");
            return (Criteria) this;
        }

        public Criteria andAccountCardNotIn(List<String> values) {
            addCriterion("ACCOUNT_CARD not in", values, "accountCard");
            return (Criteria) this;
        }

        public Criteria andAccountCardBetween(String value1, String value2) {
            addCriterion("ACCOUNT_CARD between", value1, value2, "accountCard");
            return (Criteria) this;
        }

        public Criteria andAccountCardNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_CARD not between", value1, value2, "accountCard");
            return (Criteria) this;
        }

        public Criteria andAccountBankIsNull() {
            addCriterion("ACCOUNT_BANK is null");
            return (Criteria) this;
        }

        public Criteria andAccountBankIsNotNull() {
            addCriterion("ACCOUNT_BANK is not null");
            return (Criteria) this;
        }

        public Criteria andAccountBankEqualTo(String value) {
            addCriterion("ACCOUNT_BANK =", value, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankNotEqualTo(String value) {
            addCriterion("ACCOUNT_BANK <>", value, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankGreaterThan(String value) {
            addCriterion("ACCOUNT_BANK >", value, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_BANK >=", value, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankLessThan(String value) {
            addCriterion("ACCOUNT_BANK <", value, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_BANK <=", value, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankLike(String value) {
            addCriterion("ACCOUNT_BANK like", value, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankNotLike(String value) {
            addCriterion("ACCOUNT_BANK not like", value, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankIn(List<String> values) {
            addCriterion("ACCOUNT_BANK in", values, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankNotIn(List<String> values) {
            addCriterion("ACCOUNT_BANK not in", values, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankBetween(String value1, String value2) {
            addCriterion("ACCOUNT_BANK between", value1, value2, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_BANK not between", value1, value2, "accountBank");
            return (Criteria) this;
        }

        public Criteria andContactsNameIsNull() {
            addCriterion("CONTACTS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andContactsNameIsNotNull() {
            addCriterion("CONTACTS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andContactsNameEqualTo(String value) {
            addCriterion("CONTACTS_NAME =", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotEqualTo(String value) {
            addCriterion("CONTACTS_NAME <>", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameGreaterThan(String value) {
            addCriterion("CONTACTS_NAME >", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTS_NAME >=", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameLessThan(String value) {
            addCriterion("CONTACTS_NAME <", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameLessThanOrEqualTo(String value) {
            addCriterion("CONTACTS_NAME <=", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameLike(String value) {
            addCriterion("CONTACTS_NAME like", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotLike(String value) {
            addCriterion("CONTACTS_NAME not like", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameIn(List<String> values) {
            addCriterion("CONTACTS_NAME in", values, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotIn(List<String> values) {
            addCriterion("CONTACTS_NAME not in", values, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameBetween(String value1, String value2) {
            addCriterion("CONTACTS_NAME between", value1, value2, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotBetween(String value1, String value2) {
            addCriterion("CONTACTS_NAME not between", value1, value2, "contactsName");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPromoterUnitIsNull() {
            addCriterion("PROMOTER_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andPromoterUnitIsNotNull() {
            addCriterion("PROMOTER_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andPromoterUnitEqualTo(String value) {
            addCriterion("PROMOTER_UNIT =", value, "promoterUnit");
            return (Criteria) this;
        }

        public Criteria andPromoterUnitNotEqualTo(String value) {
            addCriterion("PROMOTER_UNIT <>", value, "promoterUnit");
            return (Criteria) this;
        }

        public Criteria andPromoterUnitGreaterThan(String value) {
            addCriterion("PROMOTER_UNIT >", value, "promoterUnit");
            return (Criteria) this;
        }

        public Criteria andPromoterUnitGreaterThanOrEqualTo(String value) {
            addCriterion("PROMOTER_UNIT >=", value, "promoterUnit");
            return (Criteria) this;
        }

        public Criteria andPromoterUnitLessThan(String value) {
            addCriterion("PROMOTER_UNIT <", value, "promoterUnit");
            return (Criteria) this;
        }

        public Criteria andPromoterUnitLessThanOrEqualTo(String value) {
            addCriterion("PROMOTER_UNIT <=", value, "promoterUnit");
            return (Criteria) this;
        }

        public Criteria andPromoterUnitLike(String value) {
            addCriterion("PROMOTER_UNIT like", value, "promoterUnit");
            return (Criteria) this;
        }

        public Criteria andPromoterUnitNotLike(String value) {
            addCriterion("PROMOTER_UNIT not like", value, "promoterUnit");
            return (Criteria) this;
        }

        public Criteria andPromoterUnitIn(List<String> values) {
            addCriterion("PROMOTER_UNIT in", values, "promoterUnit");
            return (Criteria) this;
        }

        public Criteria andPromoterUnitNotIn(List<String> values) {
            addCriterion("PROMOTER_UNIT not in", values, "promoterUnit");
            return (Criteria) this;
        }

        public Criteria andPromoterUnitBetween(String value1, String value2) {
            addCriterion("PROMOTER_UNIT between", value1, value2, "promoterUnit");
            return (Criteria) this;
        }

        public Criteria andPromoterUnitNotBetween(String value1, String value2) {
            addCriterion("PROMOTER_UNIT not between", value1, value2, "promoterUnit");
            return (Criteria) this;
        }

        public Criteria andPromoterStateIsNull() {
            addCriterion("PROMOTER_STATE is null");
            return (Criteria) this;
        }

        public Criteria andPromoterStateIsNotNull() {
            addCriterion("PROMOTER_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andPromoterStateEqualTo(String value) {
            addCriterion("PROMOTER_STATE =", value, "promoterState");
            return (Criteria) this;
        }

        public Criteria andPromoterStateNotEqualTo(String value) {
            addCriterion("PROMOTER_STATE <>", value, "promoterState");
            return (Criteria) this;
        }

        public Criteria andPromoterStateGreaterThan(String value) {
            addCriterion("PROMOTER_STATE >", value, "promoterState");
            return (Criteria) this;
        }

        public Criteria andPromoterStateGreaterThanOrEqualTo(String value) {
            addCriterion("PROMOTER_STATE >=", value, "promoterState");
            return (Criteria) this;
        }

        public Criteria andPromoterStateLessThan(String value) {
            addCriterion("PROMOTER_STATE <", value, "promoterState");
            return (Criteria) this;
        }

        public Criteria andPromoterStateLessThanOrEqualTo(String value) {
            addCriterion("PROMOTER_STATE <=", value, "promoterState");
            return (Criteria) this;
        }

        public Criteria andPromoterStateLike(String value) {
            addCriterion("PROMOTER_STATE like", value, "promoterState");
            return (Criteria) this;
        }

        public Criteria andPromoterStateNotLike(String value) {
            addCriterion("PROMOTER_STATE not like", value, "promoterState");
            return (Criteria) this;
        }

        public Criteria andPromoterStateIn(List<String> values) {
            addCriterion("PROMOTER_STATE in", values, "promoterState");
            return (Criteria) this;
        }

        public Criteria andPromoterStateNotIn(List<String> values) {
            addCriterion("PROMOTER_STATE not in", values, "promoterState");
            return (Criteria) this;
        }

        public Criteria andPromoterStateBetween(String value1, String value2) {
            addCriterion("PROMOTER_STATE between", value1, value2, "promoterState");
            return (Criteria) this;
        }

        public Criteria andPromoterStateNotBetween(String value1, String value2) {
            addCriterion("PROMOTER_STATE not between", value1, value2, "promoterState");
            return (Criteria) this;
        }

        public Criteria andPromoterNameIsNull() {
            addCriterion("PROMOTER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPromoterNameIsNotNull() {
            addCriterion("PROMOTER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPromoterNameEqualTo(String value) {
            addCriterion("PROMOTER_NAME =", value, "promoterName");
            return (Criteria) this;
        }

        public Criteria andPromoterNameNotEqualTo(String value) {
            addCriterion("PROMOTER_NAME <>", value, "promoterName");
            return (Criteria) this;
        }

        public Criteria andPromoterNameGreaterThan(String value) {
            addCriterion("PROMOTER_NAME >", value, "promoterName");
            return (Criteria) this;
        }

        public Criteria andPromoterNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROMOTER_NAME >=", value, "promoterName");
            return (Criteria) this;
        }

        public Criteria andPromoterNameLessThan(String value) {
            addCriterion("PROMOTER_NAME <", value, "promoterName");
            return (Criteria) this;
        }

        public Criteria andPromoterNameLessThanOrEqualTo(String value) {
            addCriterion("PROMOTER_NAME <=", value, "promoterName");
            return (Criteria) this;
        }

        public Criteria andPromoterNameLike(String value) {
            addCriterion("PROMOTER_NAME like", value, "promoterName");
            return (Criteria) this;
        }

        public Criteria andPromoterNameNotLike(String value) {
            addCriterion("PROMOTER_NAME not like", value, "promoterName");
            return (Criteria) this;
        }

        public Criteria andPromoterNameIn(List<String> values) {
            addCriterion("PROMOTER_NAME in", values, "promoterName");
            return (Criteria) this;
        }

        public Criteria andPromoterNameNotIn(List<String> values) {
            addCriterion("PROMOTER_NAME not in", values, "promoterName");
            return (Criteria) this;
        }

        public Criteria andPromoterNameBetween(String value1, String value2) {
            addCriterion("PROMOTER_NAME between", value1, value2, "promoterName");
            return (Criteria) this;
        }

        public Criteria andPromoterNameNotBetween(String value1, String value2) {
            addCriterion("PROMOTER_NAME not between", value1, value2, "promoterName");
            return (Criteria) this;
        }

        public Criteria andBusinessExpiryDateIsNull() {
            addCriterion("BUSINESS_EXPIRY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andBusinessExpiryDateIsNotNull() {
            addCriterion("BUSINESS_EXPIRY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessExpiryDateEqualTo(String value) {
            addCriterion("BUSINESS_EXPIRY_DATE =", value, "businessExpiryDate");
            return (Criteria) this;
        }

        public Criteria andBusinessExpiryDateNotEqualTo(String value) {
            addCriterion("BUSINESS_EXPIRY_DATE <>", value, "businessExpiryDate");
            return (Criteria) this;
        }

        public Criteria andBusinessExpiryDateGreaterThan(String value) {
            addCriterion("BUSINESS_EXPIRY_DATE >", value, "businessExpiryDate");
            return (Criteria) this;
        }

        public Criteria andBusinessExpiryDateGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_EXPIRY_DATE >=", value, "businessExpiryDate");
            return (Criteria) this;
        }

        public Criteria andBusinessExpiryDateLessThan(String value) {
            addCriterion("BUSINESS_EXPIRY_DATE <", value, "businessExpiryDate");
            return (Criteria) this;
        }

        public Criteria andBusinessExpiryDateLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_EXPIRY_DATE <=", value, "businessExpiryDate");
            return (Criteria) this;
        }

        public Criteria andBusinessExpiryDateLike(String value) {
            addCriterion("BUSINESS_EXPIRY_DATE like", value, "businessExpiryDate");
            return (Criteria) this;
        }

        public Criteria andBusinessExpiryDateNotLike(String value) {
            addCriterion("BUSINESS_EXPIRY_DATE not like", value, "businessExpiryDate");
            return (Criteria) this;
        }

        public Criteria andBusinessExpiryDateIn(List<String> values) {
            addCriterion("BUSINESS_EXPIRY_DATE in", values, "businessExpiryDate");
            return (Criteria) this;
        }

        public Criteria andBusinessExpiryDateNotIn(List<String> values) {
            addCriterion("BUSINESS_EXPIRY_DATE not in", values, "businessExpiryDate");
            return (Criteria) this;
        }

        public Criteria andBusinessExpiryDateBetween(String value1, String value2) {
            addCriterion("BUSINESS_EXPIRY_DATE between", value1, value2, "businessExpiryDate");
            return (Criteria) this;
        }

        public Criteria andBusinessExpiryDateNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_EXPIRY_DATE not between", value1, value2, "businessExpiryDate");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeIsNull() {
            addCriterion("BUSINESS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeIsNotNull() {
            addCriterion("BUSINESS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeEqualTo(String value) {
            addCriterion("BUSINESS_CODE =", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotEqualTo(String value) {
            addCriterion("BUSINESS_CODE <>", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeGreaterThan(String value) {
            addCriterion("BUSINESS_CODE >", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_CODE >=", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeLessThan(String value) {
            addCriterion("BUSINESS_CODE <", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_CODE <=", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeLike(String value) {
            addCriterion("BUSINESS_CODE like", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotLike(String value) {
            addCriterion("BUSINESS_CODE not like", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeIn(List<String> values) {
            addCriterion("BUSINESS_CODE in", values, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotIn(List<String> values) {
            addCriterion("BUSINESS_CODE not in", values, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeBetween(String value1, String value2) {
            addCriterion("BUSINESS_CODE between", value1, value2, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_CODE not between", value1, value2, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessPicIsNull() {
            addCriterion("BUSINESS_PIC is null");
            return (Criteria) this;
        }

        public Criteria andBusinessPicIsNotNull() {
            addCriterion("BUSINESS_PIC is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessPicEqualTo(String value) {
            addCriterion("BUSINESS_PIC =", value, "businessPic");
            return (Criteria) this;
        }

        public Criteria andBusinessPicNotEqualTo(String value) {
            addCriterion("BUSINESS_PIC <>", value, "businessPic");
            return (Criteria) this;
        }

        public Criteria andBusinessPicGreaterThan(String value) {
            addCriterion("BUSINESS_PIC >", value, "businessPic");
            return (Criteria) this;
        }

        public Criteria andBusinessPicGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_PIC >=", value, "businessPic");
            return (Criteria) this;
        }

        public Criteria andBusinessPicLessThan(String value) {
            addCriterion("BUSINESS_PIC <", value, "businessPic");
            return (Criteria) this;
        }

        public Criteria andBusinessPicLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_PIC <=", value, "businessPic");
            return (Criteria) this;
        }

        public Criteria andBusinessPicLike(String value) {
            addCriterion("BUSINESS_PIC like", value, "businessPic");
            return (Criteria) this;
        }

        public Criteria andBusinessPicNotLike(String value) {
            addCriterion("BUSINESS_PIC not like", value, "businessPic");
            return (Criteria) this;
        }

        public Criteria andBusinessPicIn(List<String> values) {
            addCriterion("BUSINESS_PIC in", values, "businessPic");
            return (Criteria) this;
        }

        public Criteria andBusinessPicNotIn(List<String> values) {
            addCriterion("BUSINESS_PIC not in", values, "businessPic");
            return (Criteria) this;
        }

        public Criteria andBusinessPicBetween(String value1, String value2) {
            addCriterion("BUSINESS_PIC between", value1, value2, "businessPic");
            return (Criteria) this;
        }

        public Criteria andBusinessPicNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_PIC not between", value1, value2, "businessPic");
            return (Criteria) this;
        }

        public Criteria andOperateCodeIsNull() {
            addCriterion("OPERATE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOperateCodeIsNotNull() {
            addCriterion("OPERATE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOperateCodeEqualTo(String value) {
            addCriterion("OPERATE_CODE =", value, "operateCode");
            return (Criteria) this;
        }

        public Criteria andOperateCodeNotEqualTo(String value) {
            addCriterion("OPERATE_CODE <>", value, "operateCode");
            return (Criteria) this;
        }

        public Criteria andOperateCodeGreaterThan(String value) {
            addCriterion("OPERATE_CODE >", value, "operateCode");
            return (Criteria) this;
        }

        public Criteria andOperateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATE_CODE >=", value, "operateCode");
            return (Criteria) this;
        }

        public Criteria andOperateCodeLessThan(String value) {
            addCriterion("OPERATE_CODE <", value, "operateCode");
            return (Criteria) this;
        }

        public Criteria andOperateCodeLessThanOrEqualTo(String value) {
            addCriterion("OPERATE_CODE <=", value, "operateCode");
            return (Criteria) this;
        }

        public Criteria andOperateCodeLike(String value) {
            addCriterion("OPERATE_CODE like", value, "operateCode");
            return (Criteria) this;
        }

        public Criteria andOperateCodeNotLike(String value) {
            addCriterion("OPERATE_CODE not like", value, "operateCode");
            return (Criteria) this;
        }

        public Criteria andOperateCodeIn(List<String> values) {
            addCriterion("OPERATE_CODE in", values, "operateCode");
            return (Criteria) this;
        }

        public Criteria andOperateCodeNotIn(List<String> values) {
            addCriterion("OPERATE_CODE not in", values, "operateCode");
            return (Criteria) this;
        }

        public Criteria andOperateCodeBetween(String value1, String value2) {
            addCriterion("OPERATE_CODE between", value1, value2, "operateCode");
            return (Criteria) this;
        }

        public Criteria andOperateCodeNotBetween(String value1, String value2) {
            addCriterion("OPERATE_CODE not between", value1, value2, "operateCode");
            return (Criteria) this;
        }

        public Criteria andOperatePicIsNull() {
            addCriterion("OPERATE_PIC is null");
            return (Criteria) this;
        }

        public Criteria andOperatePicIsNotNull() {
            addCriterion("OPERATE_PIC is not null");
            return (Criteria) this;
        }

        public Criteria andOperatePicEqualTo(String value) {
            addCriterion("OPERATE_PIC =", value, "operatePic");
            return (Criteria) this;
        }

        public Criteria andOperatePicNotEqualTo(String value) {
            addCriterion("OPERATE_PIC <>", value, "operatePic");
            return (Criteria) this;
        }

        public Criteria andOperatePicGreaterThan(String value) {
            addCriterion("OPERATE_PIC >", value, "operatePic");
            return (Criteria) this;
        }

        public Criteria andOperatePicGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATE_PIC >=", value, "operatePic");
            return (Criteria) this;
        }

        public Criteria andOperatePicLessThan(String value) {
            addCriterion("OPERATE_PIC <", value, "operatePic");
            return (Criteria) this;
        }

        public Criteria andOperatePicLessThanOrEqualTo(String value) {
            addCriterion("OPERATE_PIC <=", value, "operatePic");
            return (Criteria) this;
        }

        public Criteria andOperatePicLike(String value) {
            addCriterion("OPERATE_PIC like", value, "operatePic");
            return (Criteria) this;
        }

        public Criteria andOperatePicNotLike(String value) {
            addCriterion("OPERATE_PIC not like", value, "operatePic");
            return (Criteria) this;
        }

        public Criteria andOperatePicIn(List<String> values) {
            addCriterion("OPERATE_PIC in", values, "operatePic");
            return (Criteria) this;
        }

        public Criteria andOperatePicNotIn(List<String> values) {
            addCriterion("OPERATE_PIC not in", values, "operatePic");
            return (Criteria) this;
        }

        public Criteria andOperatePicBetween(String value1, String value2) {
            addCriterion("OPERATE_PIC between", value1, value2, "operatePic");
            return (Criteria) this;
        }

        public Criteria andOperatePicNotBetween(String value1, String value2) {
            addCriterion("OPERATE_PIC not between", value1, value2, "operatePic");
            return (Criteria) this;
        }

        public Criteria andLegalPersionNameIsNull() {
            addCriterion("LEGAL_PERSION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersionNameIsNotNull() {
            addCriterion("LEGAL_PERSION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersionNameEqualTo(String value) {
            addCriterion("LEGAL_PERSION_NAME =", value, "legalPersionName");
            return (Criteria) this;
        }

        public Criteria andLegalPersionNameNotEqualTo(String value) {
            addCriterion("LEGAL_PERSION_NAME <>", value, "legalPersionName");
            return (Criteria) this;
        }

        public Criteria andLegalPersionNameGreaterThan(String value) {
            addCriterion("LEGAL_PERSION_NAME >", value, "legalPersionName");
            return (Criteria) this;
        }

        public Criteria andLegalPersionNameGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_PERSION_NAME >=", value, "legalPersionName");
            return (Criteria) this;
        }

        public Criteria andLegalPersionNameLessThan(String value) {
            addCriterion("LEGAL_PERSION_NAME <", value, "legalPersionName");
            return (Criteria) this;
        }

        public Criteria andLegalPersionNameLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_PERSION_NAME <=", value, "legalPersionName");
            return (Criteria) this;
        }

        public Criteria andLegalPersionNameLike(String value) {
            addCriterion("LEGAL_PERSION_NAME like", value, "legalPersionName");
            return (Criteria) this;
        }

        public Criteria andLegalPersionNameNotLike(String value) {
            addCriterion("LEGAL_PERSION_NAME not like", value, "legalPersionName");
            return (Criteria) this;
        }

        public Criteria andLegalPersionNameIn(List<String> values) {
            addCriterion("LEGAL_PERSION_NAME in", values, "legalPersionName");
            return (Criteria) this;
        }

        public Criteria andLegalPersionNameNotIn(List<String> values) {
            addCriterion("LEGAL_PERSION_NAME not in", values, "legalPersionName");
            return (Criteria) this;
        }

        public Criteria andLegalPersionNameBetween(String value1, String value2) {
            addCriterion("LEGAL_PERSION_NAME between", value1, value2, "legalPersionName");
            return (Criteria) this;
        }

        public Criteria andLegalPersionNameNotBetween(String value1, String value2) {
            addCriterion("LEGAL_PERSION_NAME not between", value1, value2, "legalPersionName");
            return (Criteria) this;
        }

        public Criteria andLegalPersionIdIsNull() {
            addCriterion("LEGAL_PERSION_ID is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersionIdIsNotNull() {
            addCriterion("LEGAL_PERSION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersionIdEqualTo(String value) {
            addCriterion("LEGAL_PERSION_ID =", value, "legalPersionId");
            return (Criteria) this;
        }

        public Criteria andLegalPersionIdNotEqualTo(String value) {
            addCriterion("LEGAL_PERSION_ID <>", value, "legalPersionId");
            return (Criteria) this;
        }

        public Criteria andLegalPersionIdGreaterThan(String value) {
            addCriterion("LEGAL_PERSION_ID >", value, "legalPersionId");
            return (Criteria) this;
        }

        public Criteria andLegalPersionIdGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_PERSION_ID >=", value, "legalPersionId");
            return (Criteria) this;
        }

        public Criteria andLegalPersionIdLessThan(String value) {
            addCriterion("LEGAL_PERSION_ID <", value, "legalPersionId");
            return (Criteria) this;
        }

        public Criteria andLegalPersionIdLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_PERSION_ID <=", value, "legalPersionId");
            return (Criteria) this;
        }

        public Criteria andLegalPersionIdLike(String value) {
            addCriterion("LEGAL_PERSION_ID like", value, "legalPersionId");
            return (Criteria) this;
        }

        public Criteria andLegalPersionIdNotLike(String value) {
            addCriterion("LEGAL_PERSION_ID not like", value, "legalPersionId");
            return (Criteria) this;
        }

        public Criteria andLegalPersionIdIn(List<String> values) {
            addCriterion("LEGAL_PERSION_ID in", values, "legalPersionId");
            return (Criteria) this;
        }

        public Criteria andLegalPersionIdNotIn(List<String> values) {
            addCriterion("LEGAL_PERSION_ID not in", values, "legalPersionId");
            return (Criteria) this;
        }

        public Criteria andLegalPersionIdBetween(String value1, String value2) {
            addCriterion("LEGAL_PERSION_ID between", value1, value2, "legalPersionId");
            return (Criteria) this;
        }

        public Criteria andLegalPersionIdNotBetween(String value1, String value2) {
            addCriterion("LEGAL_PERSION_ID not between", value1, value2, "legalPersionId");
            return (Criteria) this;
        }

        public Criteria andLegalPersionFrontIsNull() {
            addCriterion("LEGAL_PERSION_FRONT is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersionFrontIsNotNull() {
            addCriterion("LEGAL_PERSION_FRONT is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersionFrontEqualTo(String value) {
            addCriterion("LEGAL_PERSION_FRONT =", value, "legalPersionFront");
            return (Criteria) this;
        }

        public Criteria andLegalPersionFrontNotEqualTo(String value) {
            addCriterion("LEGAL_PERSION_FRONT <>", value, "legalPersionFront");
            return (Criteria) this;
        }

        public Criteria andLegalPersionFrontGreaterThan(String value) {
            addCriterion("LEGAL_PERSION_FRONT >", value, "legalPersionFront");
            return (Criteria) this;
        }

        public Criteria andLegalPersionFrontGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_PERSION_FRONT >=", value, "legalPersionFront");
            return (Criteria) this;
        }

        public Criteria andLegalPersionFrontLessThan(String value) {
            addCriterion("LEGAL_PERSION_FRONT <", value, "legalPersionFront");
            return (Criteria) this;
        }

        public Criteria andLegalPersionFrontLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_PERSION_FRONT <=", value, "legalPersionFront");
            return (Criteria) this;
        }

        public Criteria andLegalPersionFrontLike(String value) {
            addCriterion("LEGAL_PERSION_FRONT like", value, "legalPersionFront");
            return (Criteria) this;
        }

        public Criteria andLegalPersionFrontNotLike(String value) {
            addCriterion("LEGAL_PERSION_FRONT not like", value, "legalPersionFront");
            return (Criteria) this;
        }

        public Criteria andLegalPersionFrontIn(List<String> values) {
            addCriterion("LEGAL_PERSION_FRONT in", values, "legalPersionFront");
            return (Criteria) this;
        }

        public Criteria andLegalPersionFrontNotIn(List<String> values) {
            addCriterion("LEGAL_PERSION_FRONT not in", values, "legalPersionFront");
            return (Criteria) this;
        }

        public Criteria andLegalPersionFrontBetween(String value1, String value2) {
            addCriterion("LEGAL_PERSION_FRONT between", value1, value2, "legalPersionFront");
            return (Criteria) this;
        }

        public Criteria andLegalPersionFrontNotBetween(String value1, String value2) {
            addCriterion("LEGAL_PERSION_FRONT not between", value1, value2, "legalPersionFront");
            return (Criteria) this;
        }

        public Criteria andLegalPersionBackIsNull() {
            addCriterion("LEGAL_PERSION_BACK is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersionBackIsNotNull() {
            addCriterion("LEGAL_PERSION_BACK is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersionBackEqualTo(String value) {
            addCriterion("LEGAL_PERSION_BACK =", value, "legalPersionBack");
            return (Criteria) this;
        }

        public Criteria andLegalPersionBackNotEqualTo(String value) {
            addCriterion("LEGAL_PERSION_BACK <>", value, "legalPersionBack");
            return (Criteria) this;
        }

        public Criteria andLegalPersionBackGreaterThan(String value) {
            addCriterion("LEGAL_PERSION_BACK >", value, "legalPersionBack");
            return (Criteria) this;
        }

        public Criteria andLegalPersionBackGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_PERSION_BACK >=", value, "legalPersionBack");
            return (Criteria) this;
        }

        public Criteria andLegalPersionBackLessThan(String value) {
            addCriterion("LEGAL_PERSION_BACK <", value, "legalPersionBack");
            return (Criteria) this;
        }

        public Criteria andLegalPersionBackLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_PERSION_BACK <=", value, "legalPersionBack");
            return (Criteria) this;
        }

        public Criteria andLegalPersionBackLike(String value) {
            addCriterion("LEGAL_PERSION_BACK like", value, "legalPersionBack");
            return (Criteria) this;
        }

        public Criteria andLegalPersionBackNotLike(String value) {
            addCriterion("LEGAL_PERSION_BACK not like", value, "legalPersionBack");
            return (Criteria) this;
        }

        public Criteria andLegalPersionBackIn(List<String> values) {
            addCriterion("LEGAL_PERSION_BACK in", values, "legalPersionBack");
            return (Criteria) this;
        }

        public Criteria andLegalPersionBackNotIn(List<String> values) {
            addCriterion("LEGAL_PERSION_BACK not in", values, "legalPersionBack");
            return (Criteria) this;
        }

        public Criteria andLegalPersionBackBetween(String value1, String value2) {
            addCriterion("LEGAL_PERSION_BACK between", value1, value2, "legalPersionBack");
            return (Criteria) this;
        }

        public Criteria andLegalPersionBackNotBetween(String value1, String value2) {
            addCriterion("LEGAL_PERSION_BACK not between", value1, value2, "legalPersionBack");
            return (Criteria) this;
        }

        public Criteria andPosExamineInfoIsNull() {
            addCriterion("POS_EXAMINE_INFO is null");
            return (Criteria) this;
        }

        public Criteria andPosExamineInfoIsNotNull() {
            addCriterion("POS_EXAMINE_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andPosExamineInfoEqualTo(String value) {
            addCriterion("POS_EXAMINE_INFO =", value, "posExamineInfo");
            return (Criteria) this;
        }

        public Criteria andPosExamineInfoNotEqualTo(String value) {
            addCriterion("POS_EXAMINE_INFO <>", value, "posExamineInfo");
            return (Criteria) this;
        }

        public Criteria andPosExamineInfoGreaterThan(String value) {
            addCriterion("POS_EXAMINE_INFO >", value, "posExamineInfo");
            return (Criteria) this;
        }

        public Criteria andPosExamineInfoGreaterThanOrEqualTo(String value) {
            addCriterion("POS_EXAMINE_INFO >=", value, "posExamineInfo");
            return (Criteria) this;
        }

        public Criteria andPosExamineInfoLessThan(String value) {
            addCriterion("POS_EXAMINE_INFO <", value, "posExamineInfo");
            return (Criteria) this;
        }

        public Criteria andPosExamineInfoLessThanOrEqualTo(String value) {
            addCriterion("POS_EXAMINE_INFO <=", value, "posExamineInfo");
            return (Criteria) this;
        }

        public Criteria andPosExamineInfoLike(String value) {
            addCriterion("POS_EXAMINE_INFO like", value, "posExamineInfo");
            return (Criteria) this;
        }

        public Criteria andPosExamineInfoNotLike(String value) {
            addCriterion("POS_EXAMINE_INFO not like", value, "posExamineInfo");
            return (Criteria) this;
        }

        public Criteria andPosExamineInfoIn(List<String> values) {
            addCriterion("POS_EXAMINE_INFO in", values, "posExamineInfo");
            return (Criteria) this;
        }

        public Criteria andPosExamineInfoNotIn(List<String> values) {
            addCriterion("POS_EXAMINE_INFO not in", values, "posExamineInfo");
            return (Criteria) this;
        }

        public Criteria andPosExamineInfoBetween(String value1, String value2) {
            addCriterion("POS_EXAMINE_INFO between", value1, value2, "posExamineInfo");
            return (Criteria) this;
        }

        public Criteria andPosExamineInfoNotBetween(String value1, String value2) {
            addCriterion("POS_EXAMINE_INFO not between", value1, value2, "posExamineInfo");
            return (Criteria) this;
        }

        public Criteria andPosExamineStateIsNull() {
            addCriterion("POS_EXAMINE_STATE is null");
            return (Criteria) this;
        }

        public Criteria andPosExamineStateIsNotNull() {
            addCriterion("POS_EXAMINE_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andPosExamineStateEqualTo(String value) {
            addCriterion("POS_EXAMINE_STATE =", value, "posExamineState");
            return (Criteria) this;
        }

        public Criteria andPosExamineStateNotEqualTo(String value) {
            addCriterion("POS_EXAMINE_STATE <>", value, "posExamineState");
            return (Criteria) this;
        }

        public Criteria andPosExamineStateGreaterThan(String value) {
            addCriterion("POS_EXAMINE_STATE >", value, "posExamineState");
            return (Criteria) this;
        }

        public Criteria andPosExamineStateGreaterThanOrEqualTo(String value) {
            addCriterion("POS_EXAMINE_STATE >=", value, "posExamineState");
            return (Criteria) this;
        }

        public Criteria andPosExamineStateLessThan(String value) {
            addCriterion("POS_EXAMINE_STATE <", value, "posExamineState");
            return (Criteria) this;
        }

        public Criteria andPosExamineStateLessThanOrEqualTo(String value) {
            addCriterion("POS_EXAMINE_STATE <=", value, "posExamineState");
            return (Criteria) this;
        }

        public Criteria andPosExamineStateLike(String value) {
            addCriterion("POS_EXAMINE_STATE like", value, "posExamineState");
            return (Criteria) this;
        }

        public Criteria andPosExamineStateNotLike(String value) {
            addCriterion("POS_EXAMINE_STATE not like", value, "posExamineState");
            return (Criteria) this;
        }

        public Criteria andPosExamineStateIn(List<String> values) {
            addCriterion("POS_EXAMINE_STATE in", values, "posExamineState");
            return (Criteria) this;
        }

        public Criteria andPosExamineStateNotIn(List<String> values) {
            addCriterion("POS_EXAMINE_STATE not in", values, "posExamineState");
            return (Criteria) this;
        }

        public Criteria andPosExamineStateBetween(String value1, String value2) {
            addCriterion("POS_EXAMINE_STATE between", value1, value2, "posExamineState");
            return (Criteria) this;
        }

        public Criteria andPosExamineStateNotBetween(String value1, String value2) {
            addCriterion("POS_EXAMINE_STATE not between", value1, value2, "posExamineState");
            return (Criteria) this;
        }

        public Criteria andExaminePersionIsNull() {
            addCriterion("EXAMINE_PERSION is null");
            return (Criteria) this;
        }

        public Criteria andExaminePersionIsNotNull() {
            addCriterion("EXAMINE_PERSION is not null");
            return (Criteria) this;
        }

        public Criteria andExaminePersionEqualTo(String value) {
            addCriterion("EXAMINE_PERSION =", value, "examinePersion");
            return (Criteria) this;
        }

        public Criteria andExaminePersionNotEqualTo(String value) {
            addCriterion("EXAMINE_PERSION <>", value, "examinePersion");
            return (Criteria) this;
        }

        public Criteria andExaminePersionGreaterThan(String value) {
            addCriterion("EXAMINE_PERSION >", value, "examinePersion");
            return (Criteria) this;
        }

        public Criteria andExaminePersionGreaterThanOrEqualTo(String value) {
            addCriterion("EXAMINE_PERSION >=", value, "examinePersion");
            return (Criteria) this;
        }

        public Criteria andExaminePersionLessThan(String value) {
            addCriterion("EXAMINE_PERSION <", value, "examinePersion");
            return (Criteria) this;
        }

        public Criteria andExaminePersionLessThanOrEqualTo(String value) {
            addCriterion("EXAMINE_PERSION <=", value, "examinePersion");
            return (Criteria) this;
        }

        public Criteria andExaminePersionLike(String value) {
            addCriterion("EXAMINE_PERSION like", value, "examinePersion");
            return (Criteria) this;
        }

        public Criteria andExaminePersionNotLike(String value) {
            addCriterion("EXAMINE_PERSION not like", value, "examinePersion");
            return (Criteria) this;
        }

        public Criteria andExaminePersionIn(List<String> values) {
            addCriterion("EXAMINE_PERSION in", values, "examinePersion");
            return (Criteria) this;
        }

        public Criteria andExaminePersionNotIn(List<String> values) {
            addCriterion("EXAMINE_PERSION not in", values, "examinePersion");
            return (Criteria) this;
        }

        public Criteria andExaminePersionBetween(String value1, String value2) {
            addCriterion("EXAMINE_PERSION between", value1, value2, "examinePersion");
            return (Criteria) this;
        }

        public Criteria andExaminePersionNotBetween(String value1, String value2) {
            addCriterion("EXAMINE_PERSION not between", value1, value2, "examinePersion");
            return (Criteria) this;
        }

        public Criteria andExamineTimeIsNull() {
            addCriterion("EXAMINE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andExamineTimeIsNotNull() {
            addCriterion("EXAMINE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andExamineTimeEqualTo(String value) {
            addCriterion("EXAMINE_TIME =", value, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeNotEqualTo(String value) {
            addCriterion("EXAMINE_TIME <>", value, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeGreaterThan(String value) {
            addCriterion("EXAMINE_TIME >", value, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeGreaterThanOrEqualTo(String value) {
            addCriterion("EXAMINE_TIME >=", value, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeLessThan(String value) {
            addCriterion("EXAMINE_TIME <", value, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeLessThanOrEqualTo(String value) {
            addCriterion("EXAMINE_TIME <=", value, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeLike(String value) {
            addCriterion("EXAMINE_TIME like", value, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeNotLike(String value) {
            addCriterion("EXAMINE_TIME not like", value, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeIn(List<String> values) {
            addCriterion("EXAMINE_TIME in", values, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeNotIn(List<String> values) {
            addCriterion("EXAMINE_TIME not in", values, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeBetween(String value1, String value2) {
            addCriterion("EXAMINE_TIME between", value1, value2, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeNotBetween(String value1, String value2) {
            addCriterion("EXAMINE_TIME not between", value1, value2, "examineTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("CREATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("CREATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(String value) {
            addCriterion("CREATED_TIME =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(String value) {
            addCriterion("CREATED_TIME <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(String value) {
            addCriterion("CREATED_TIME >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_TIME >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(String value) {
            addCriterion("CREATED_TIME <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(String value) {
            addCriterion("CREATED_TIME <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLike(String value) {
            addCriterion("CREATED_TIME like", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotLike(String value) {
            addCriterion("CREATED_TIME not like", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<String> values) {
            addCriterion("CREATED_TIME in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<String> values) {
            addCriterion("CREATED_TIME not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(String value1, String value2) {
            addCriterion("CREATED_TIME between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(String value1, String value2) {
            addCriterion("CREATED_TIME not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNull() {
            addCriterion("UPDATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNotNull() {
            addCriterion("UPDATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeEqualTo(String value) {
            addCriterion("UPDATED_TIME =", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotEqualTo(String value) {
            addCriterion("UPDATED_TIME <>", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThan(String value) {
            addCriterion("UPDATED_TIME >", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATED_TIME >=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThan(String value) {
            addCriterion("UPDATED_TIME <", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThanOrEqualTo(String value) {
            addCriterion("UPDATED_TIME <=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLike(String value) {
            addCriterion("UPDATED_TIME like", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotLike(String value) {
            addCriterion("UPDATED_TIME not like", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIn(List<String> values) {
            addCriterion("UPDATED_TIME in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotIn(List<String> values) {
            addCriterion("UPDATED_TIME not in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeBetween(String value1, String value2) {
            addCriterion("UPDATED_TIME between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotBetween(String value1, String value2) {
            addCriterion("UPDATED_TIME not between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andSignBankIsNull() {
            addCriterion("SIGN_BANK is null");
            return (Criteria) this;
        }

        public Criteria andSignBankIsNotNull() {
            addCriterion("SIGN_BANK is not null");
            return (Criteria) this;
        }

        public Criteria andSignBankEqualTo(String value) {
            addCriterion("SIGN_BANK =", value, "signBank");
            return (Criteria) this;
        }

        public Criteria andSignBankNotEqualTo(String value) {
            addCriterion("SIGN_BANK <>", value, "signBank");
            return (Criteria) this;
        }

        public Criteria andSignBankGreaterThan(String value) {
            addCriterion("SIGN_BANK >", value, "signBank");
            return (Criteria) this;
        }

        public Criteria andSignBankGreaterThanOrEqualTo(String value) {
            addCriterion("SIGN_BANK >=", value, "signBank");
            return (Criteria) this;
        }

        public Criteria andSignBankLessThan(String value) {
            addCriterion("SIGN_BANK <", value, "signBank");
            return (Criteria) this;
        }

        public Criteria andSignBankLessThanOrEqualTo(String value) {
            addCriterion("SIGN_BANK <=", value, "signBank");
            return (Criteria) this;
        }

        public Criteria andSignBankLike(String value) {
            addCriterion("SIGN_BANK like", value, "signBank");
            return (Criteria) this;
        }

        public Criteria andSignBankNotLike(String value) {
            addCriterion("SIGN_BANK not like", value, "signBank");
            return (Criteria) this;
        }

        public Criteria andSignBankIn(List<String> values) {
            addCriterion("SIGN_BANK in", values, "signBank");
            return (Criteria) this;
        }

        public Criteria andSignBankNotIn(List<String> values) {
            addCriterion("SIGN_BANK not in", values, "signBank");
            return (Criteria) this;
        }

        public Criteria andSignBankBetween(String value1, String value2) {
            addCriterion("SIGN_BANK between", value1, value2, "signBank");
            return (Criteria) this;
        }

        public Criteria andSignBankNotBetween(String value1, String value2) {
            addCriterion("SIGN_BANK not between", value1, value2, "signBank");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}