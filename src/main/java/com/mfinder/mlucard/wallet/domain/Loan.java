package com.mfinder.mlucard.wallet.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="m_loan")
public class Loan {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long loanId;

    @Version
    int version;

    @Column(name = "account_no", length = 20, unique = true, nullable = false)
    private String accountNumber;

    @Column(name = "external_id")
    private String externalId;

  
    @Column(name = "term_frequency", nullable = false)
    private Integer termFrequency;

    @Column(name = "term_period_frequency_enum", nullable = false)
    private Integer termPeriodFrequencyType;

    @Column(name = "loan_status_id", nullable = false)
    private Integer loanStatus;

    @Column(name = "sync_disbursement_with_meeting", nullable = true)
    private Boolean syncDisbursementWithMeeting;

    // loan application states
    @Temporal(TemporalType.DATE)
    @Column(name = "submittedon_date")
    private Date submittedOnDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "rejectedon_date")
    private Date rejectedOnDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "withdrawnon_date")
    private Date withdrawnOnDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "approvedon_date")
    private Date approvedOnDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "expected_disbursedon_date")
    private Date expectedDisbursementDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "disbursedon_date")
    private Date actualDisbursementDate;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "closedon_date")
    private Date closedOnDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "writtenoffon_date")
    private Date writtenOffOnDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "rescheduledon_date")
    private Date rescheduledOnDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "expected_maturedon_date")
    private Date expectedMaturityDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "maturedon_date")
    private Date actualMaturityDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "expected_firstrepaymenton_date")
    private Date expectedFirstRepaymentOnDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "interest_calculated_from_date")
    private Date interestChargedFromDate;

    @Column(name = "total_overpaid_derived", scale = 6, precision = 19)
    private BigDecimal totalOverpaid;

    @Column(name = "loan_counter")
    private Integer loanCounter;

    @Column(name = "loan_product_counter")
    private Integer loanProductCounter;
 
    @Column(name = "principal_amount_proposed", scale = 6, precision = 19, nullable = false)
    private BigDecimal proposedPrincipal;

    @Column(name = "approved_principal", scale = 6, precision = 19, nullable = false)
    private BigDecimal approvedPrincipal;

    @Column(name = "fixed_emi_amount", scale = 6, precision = 19, nullable = true)
    private BigDecimal fixedEmiAmount;

    @Column(name = "max_outstanding_loan_balance", scale = 6, precision = 19, nullable = true)
    private BigDecimal maxOutstandingLoanBalance;

    @Column(name = "total_recovered_derived", scale = 6, precision = 19)
    private BigDecimal totalRecovered;

    @Column(name = "is_npa", nullable = false)
    private boolean isNpa;

    @Temporal(TemporalType.DATE)
    @Column(name = "accrued_till")
    private Date accruedTill;

    @Column(name = "create_standing_instruction_at_disbursement", nullable = true)
    private Boolean createStandingInstructionAtDisbursement;

    @Column(name = "guarantee_amount_derived", scale = 6, precision = 19, nullable = true)
    private BigDecimal guaranteeAmountDerived;

    @Temporal(TemporalType.DATE)
    @Column(name = "interest_recalcualated_on")
    private Date interestRecalculatedOn;

    @Column(name = "is_floating_interest_rate", nullable = true)
    private Boolean isFloatingInterestRate;

    @Column(name = "interest_rate_differential", scale = 6, precision = 19, nullable = true)
    private BigDecimal interestRateDifferential;

    @Column(name = "loan_sub_status_id", nullable = true)
    private Integer loanSubStatus;

    @Column(name = "is_topup", nullable = false)
    private boolean isTopup = false;

	public Long getLoanId() {
		return loanId;
	}

	public void setLoanId(Long loanId) {
		this.loanId = loanId;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public Integer getTermFrequency() {
		return termFrequency;
	}

	public void setTermFrequency(Integer termFrequency) {
		this.termFrequency = termFrequency;
	}

	public Integer getTermPeriodFrequencyType() {
		return termPeriodFrequencyType;
	}

	public void setTermPeriodFrequencyType(Integer termPeriodFrequencyType) {
		this.termPeriodFrequencyType = termPeriodFrequencyType;
	}

	public Integer getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(Integer loanStatus) {
		this.loanStatus = loanStatus;
	}

	public Boolean getSyncDisbursementWithMeeting() {
		return syncDisbursementWithMeeting;
	}

	public void setSyncDisbursementWithMeeting(Boolean syncDisbursementWithMeeting) {
		this.syncDisbursementWithMeeting = syncDisbursementWithMeeting;
	}

	public Date getSubmittedOnDate() {
		return submittedOnDate;
	}

	public void setSubmittedOnDate(Date submittedOnDate) {
		this.submittedOnDate = submittedOnDate;
	}

	public Date getRejectedOnDate() {
		return rejectedOnDate;
	}

	public void setRejectedOnDate(Date rejectedOnDate) {
		this.rejectedOnDate = rejectedOnDate;
	}

	public Date getWithdrawnOnDate() {
		return withdrawnOnDate;
	}

	public void setWithdrawnOnDate(Date withdrawnOnDate) {
		this.withdrawnOnDate = withdrawnOnDate;
	}

	public Date getApprovedOnDate() {
		return approvedOnDate;
	}

	public void setApprovedOnDate(Date approvedOnDate) {
		this.approvedOnDate = approvedOnDate;
	}

	public Date getExpectedDisbursementDate() {
		return expectedDisbursementDate;
	}

	public void setExpectedDisbursementDate(Date expectedDisbursementDate) {
		this.expectedDisbursementDate = expectedDisbursementDate;
	}

	public Date getActualDisbursementDate() {
		return actualDisbursementDate;
	}

	public void setActualDisbursementDate(Date actualDisbursementDate) {
		this.actualDisbursementDate = actualDisbursementDate;
	}

	public Date getClosedOnDate() {
		return closedOnDate;
	}

	public void setClosedOnDate(Date closedOnDate) {
		this.closedOnDate = closedOnDate;
	}

	public Date getWrittenOffOnDate() {
		return writtenOffOnDate;
	}

	public void setWrittenOffOnDate(Date writtenOffOnDate) {
		this.writtenOffOnDate = writtenOffOnDate;
	}

	public Date getRescheduledOnDate() {
		return rescheduledOnDate;
	}

	public void setRescheduledOnDate(Date rescheduledOnDate) {
		this.rescheduledOnDate = rescheduledOnDate;
	}

	public Date getExpectedMaturityDate() {
		return expectedMaturityDate;
	}

	public void setExpectedMaturityDate(Date expectedMaturityDate) {
		this.expectedMaturityDate = expectedMaturityDate;
	}

	public Date getActualMaturityDate() {
		return actualMaturityDate;
	}

	public void setActualMaturityDate(Date actualMaturityDate) {
		this.actualMaturityDate = actualMaturityDate;
	}

	public Date getExpectedFirstRepaymentOnDate() {
		return expectedFirstRepaymentOnDate;
	}

	public void setExpectedFirstRepaymentOnDate(Date expectedFirstRepaymentOnDate) {
		this.expectedFirstRepaymentOnDate = expectedFirstRepaymentOnDate;
	}

	public Date getInterestChargedFromDate() {
		return interestChargedFromDate;
	}

	public void setInterestChargedFromDate(Date interestChargedFromDate) {
		this.interestChargedFromDate = interestChargedFromDate;
	}

	public BigDecimal getTotalOverpaid() {
		return totalOverpaid;
	}

	public void setTotalOverpaid(BigDecimal totalOverpaid) {
		this.totalOverpaid = totalOverpaid;
	}

	public Integer getLoanCounter() {
		return loanCounter;
	}

	public void setLoanCounter(Integer loanCounter) {
		this.loanCounter = loanCounter;
	}

	public Integer getLoanProductCounter() {
		return loanProductCounter;
	}

	public void setLoanProductCounter(Integer loanProductCounter) {
		this.loanProductCounter = loanProductCounter;
	}

	public BigDecimal getProposedPrincipal() {
		return proposedPrincipal;
	}

	public void setProposedPrincipal(BigDecimal proposedPrincipal) {
		this.proposedPrincipal = proposedPrincipal;
	}

	public BigDecimal getApprovedPrincipal() {
		return approvedPrincipal;
	}

	public void setApprovedPrincipal(BigDecimal approvedPrincipal) {
		this.approvedPrincipal = approvedPrincipal;
	}

	public BigDecimal getFixedEmiAmount() {
		return fixedEmiAmount;
	}

	public void setFixedEmiAmount(BigDecimal fixedEmiAmount) {
		this.fixedEmiAmount = fixedEmiAmount;
	}

	public BigDecimal getMaxOutstandingLoanBalance() {
		return maxOutstandingLoanBalance;
	}

	public void setMaxOutstandingLoanBalance(BigDecimal maxOutstandingLoanBalance) {
		this.maxOutstandingLoanBalance = maxOutstandingLoanBalance;
	}

	public BigDecimal getTotalRecovered() {
		return totalRecovered;
	}

	public void setTotalRecovered(BigDecimal totalRecovered) {
		this.totalRecovered = totalRecovered;
	}

	public boolean isNpa() {
		return isNpa;
	}

	public void setNpa(boolean isNpa) {
		this.isNpa = isNpa;
	}

	public Date getAccruedTill() {
		return accruedTill;
	}

	public void setAccruedTill(Date accruedTill) {
		this.accruedTill = accruedTill;
	}

	public Boolean getCreateStandingInstructionAtDisbursement() {
		return createStandingInstructionAtDisbursement;
	}

	public void setCreateStandingInstructionAtDisbursement(Boolean createStandingInstructionAtDisbursement) {
		this.createStandingInstructionAtDisbursement = createStandingInstructionAtDisbursement;
	}

	public BigDecimal getGuaranteeAmountDerived() {
		return guaranteeAmountDerived;
	}

	public void setGuaranteeAmountDerived(BigDecimal guaranteeAmountDerived) {
		this.guaranteeAmountDerived = guaranteeAmountDerived;
	}

	public Date getInterestRecalculatedOn() {
		return interestRecalculatedOn;
	}

	public void setInterestRecalculatedOn(Date interestRecalculatedOn) {
		this.interestRecalculatedOn = interestRecalculatedOn;
	}

	public Boolean getIsFloatingInterestRate() {
		return isFloatingInterestRate;
	}

	public void setIsFloatingInterestRate(Boolean isFloatingInterestRate) {
		this.isFloatingInterestRate = isFloatingInterestRate;
	}

	public BigDecimal getInterestRateDifferential() {
		return interestRateDifferential;
	}

	public void setInterestRateDifferential(BigDecimal interestRateDifferential) {
		this.interestRateDifferential = interestRateDifferential;
	}

	public Integer getLoanSubStatus() {
		return loanSubStatus;
	}

	public void setLoanSubStatus(Integer loanSubStatus) {
		this.loanSubStatus = loanSubStatus;
	}

	public boolean isTopup() {
		return isTopup;
	}

	public void setTopup(boolean isTopup) {
		this.isTopup = isTopup;
	}
}
