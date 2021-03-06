package io.oasp.application.mtsj.ordermanagement.logic.api.to;

import io.oasp.module.jpa.common.api.to.SearchCriteriaTo;

/**
 * This is the {@link SearchCriteriaTo search criteria} {@link net.sf.mmm.util.transferobject.api.TransferObject TO}
 * used to find {@link io.oasp.application.mtsj.ordermanagement.common.api.Order}s.
 */
public class OrderSearchCriteriaTo extends SearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private Long bookingId;

  private Long invitedGuestId;

  private String hostToken;

  private Long hostId;

  private String email;

  private String bookingToken;

  /**
   * The constructor.
   */
  public OrderSearchCriteriaTo() {

    super();
  }

  public Long getBookingId() {

    return this.bookingId;
  }

  public void setBookingId(Long bookingId) {

    this.bookingId = bookingId;
  }

  public Long getInvitedGuestId() {

    return this.invitedGuestId;
  }

  public void setInvitedGuestId(Long invitedGuestId) {

    this.invitedGuestId = invitedGuestId;
  }

  public String getHostToken() {

    return this.hostToken;
  }

  public void setHostToken(String hostToken) {

    this.hostToken = hostToken;
  }

  public Long getHostId() {

    return this.hostId;
  }

  public void setHostId(Long hostId) {

    this.hostId = hostId;
  }

  /**
   * @return email
   */
  public String getEmail() {

    return this.email;
  }

  /**
   * @param email new value of {@link #getEmail}.
   */
  public void setEmail(String email) {

    this.email = email;
  }

  /**
   * @return bookingToken
   */
  public String getBookingToken() {

    return this.bookingToken;
  }

  /**
   * @param bookingToken new value of {@link #getBookingToken}.
   */
  public void setBookingToken(String bookingToken) {

    this.bookingToken = bookingToken;
  }

}
