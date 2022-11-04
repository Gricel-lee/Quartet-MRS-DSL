/**
 */
package patterns.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import patterns.PatternsFactory;
import patterns.PatternsPackage;
import patterns.ProblemSpecifications;

/**
 * This is the item provider adapter for a {@link patterns.ProblemSpecifications} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProblemSpecificationsItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemSpecificationsItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__CONDITION);
			childrenFeatures.add(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__LOCATION);
			childrenFeatures.add(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__ACTION);
			childrenFeatures.add(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__ROBOTS);
			childrenFeatures.add(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__TOPMISSIONS);
			childrenFeatures.add(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__ELEMENTARY_PATTERNS);
			childrenFeatures.add(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__COMPOSITE_PATTERNS);
			childrenFeatures.add(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__SPECIFICATION_PATTERNS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ProblemSpecifications.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ProblemSpecifications"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ProblemSpecifications_type");
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ProblemSpecifications.class)) {
			case PatternsPackage.PROBLEM_SPECIFICATIONS__CONDITION:
			case PatternsPackage.PROBLEM_SPECIFICATIONS__LOCATION:
			case PatternsPackage.PROBLEM_SPECIFICATIONS__ACTION:
			case PatternsPackage.PROBLEM_SPECIFICATIONS__ROBOTS:
			case PatternsPackage.PROBLEM_SPECIFICATIONS__TOPMISSIONS:
			case PatternsPackage.PROBLEM_SPECIFICATIONS__ELEMENTARY_PATTERNS:
			case PatternsPackage.PROBLEM_SPECIFICATIONS__COMPOSITE_PATTERNS:
			case PatternsPackage.PROBLEM_SPECIFICATIONS__SPECIFICATION_PATTERNS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__CONDITION,
				 PatternsFactory.eINSTANCE.createLocationEvent()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__CONDITION,
				 PatternsFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__CONDITION,
				 PatternsFactory.eINSTANCE.createActionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__LOCATION,
				 PatternsFactory.eINSTANCE.createLocation()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__ACTION,
				 PatternsFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__ROBOTS,
				 PatternsFactory.eINSTANCE.createRobots()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__TOPMISSIONS,
				 PatternsFactory.eINSTANCE.createTopMissions()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__ELEMENTARY_PATTERNS,
				 PatternsFactory.eINSTANCE.createMaximize()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__ELEMENTARY_PATTERNS,
				 PatternsFactory.eINSTANCE.createLessThan()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__ELEMENTARY_PATTERNS,
				 PatternsFactory.eINSTANCE.createMinimize()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__ELEMENTARY_PATTERNS,
				 PatternsFactory.eINSTANCE.createAtMost()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__ELEMENTARY_PATTERNS,
				 PatternsFactory.eINSTANCE.createAtLeast()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__ELEMENTARY_PATTERNS,
				 PatternsFactory.eINSTANCE.createGreaterThan()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__ELEMENTARY_PATTERNS,
				 PatternsFactory.eINSTANCE.createWithin()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__ELEMENTARY_PATTERNS,
				 PatternsFactory.eINSTANCE.createStrictlyWithin()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__COMPOSITE_PATTERNS,
				 PatternsFactory.eINSTANCE.createConservation()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__COMPOSITE_PATTERNS,
				 PatternsFactory.eINSTANCE.createPreservation()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__COMPOSITE_PATTERNS,
				 PatternsFactory.eINSTANCE.createRepeatEvery()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__COMPOSITE_PATTERNS,
				 PatternsFactory.eINSTANCE.createMaintain()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__COMPOSITE_PATTERNS,
				 PatternsFactory.eINSTANCE.createEnd()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__COMPOSITE_PATTERNS,
				 PatternsFactory.eINSTANCE.createResumeIf()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__COMPOSITE_PATTERNS,
				 PatternsFactory.eINSTANCE.createAccrue()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__COMPOSITE_PATTERNS,
				 PatternsFactory.eINSTANCE.createSecure()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__COMPOSITE_PATTERNS,
				 PatternsFactory.eINSTANCE.createEquidistance()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__COMPOSITE_PATTERNS,
				 PatternsFactory.eINSTANCE.createTrail()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__COMPOSITE_PATTERNS,
				 PatternsFactory.eINSTANCE.createPause()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__COMPOSITE_PATTERNS,
				 PatternsFactory.eINSTANCE.createTimeout()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__COMPOSITE_PATTERNS,
				 PatternsFactory.eINSTANCE.createReliabilityConfidence()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__COMPOSITE_PATTERNS,
				 PatternsFactory.eINSTANCE.createRelaxed()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__COMPOSITE_PATTERNS,
				 PatternsFactory.eINSTANCE.createAlmostAt()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__COMPOSITE_PATTERNS,
				 PatternsFactory.eINSTANCE.createExactlyAt()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__COMPOSITE_PATTERNS,
				 PatternsFactory.eINSTANCE.createDeadlineAt()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__COMPOSITE_PATTERNS,
				 PatternsFactory.eINSTANCE.createProportional()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__COMPOSITE_PATTERNS,
				 PatternsFactory.eINSTANCE.createExecute()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__COMPOSITE_PATTERNS,
				 PatternsFactory.eINSTANCE.createSequencing()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__COMPOSITE_PATTERNS,
				 PatternsFactory.eINSTANCE.createDeviation()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__COMPOSITE_PATTERNS,
				 PatternsFactory.eINSTANCE.createRepeat()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__SPECIFICATION_PATTERNS,
				 PatternsFactory.eINSTANCE.createVisit1()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__SPECIFICATION_PATTERNS,
				 PatternsFactory.eINSTANCE.createSequence()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__SPECIFICATION_PATTERNS,
				 PatternsFactory.eINSTANCE.createOrder()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__SPECIFICATION_PATTERNS,
				 PatternsFactory.eINSTANCE.createStrictOrder()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__SPECIFICATION_PATTERNS,
				 PatternsFactory.eINSTANCE.createPatrol()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__SPECIFICATION_PATTERNS,
				 PatternsFactory.eINSTANCE.createFair()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__SPECIFICATION_PATTERNS,
				 PatternsFactory.eINSTANCE.createVisit2()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__SPECIFICATION_PATTERNS,
				 PatternsFactory.eINSTANCE.createLess()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__SPECIFICATION_PATTERNS,
				 PatternsFactory.eINSTANCE.createExactly()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__SPECIFICATION_PATTERNS,
				 PatternsFactory.eINSTANCE.createSimple()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__SPECIFICATION_PATTERNS,
				 PatternsFactory.eINSTANCE.createAvoid()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__SPECIFICATION_PATTERNS,
				 PatternsFactory.eINSTANCE.createAfter()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__SPECIFICATION_PATTERNS,
				 PatternsFactory.eINSTANCE.createWait()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__SPECIFICATION_PATTERNS,
				 PatternsFactory.eINSTANCE.createReact()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__SPECIFICATION_PATTERNS,
				 PatternsFactory.eINSTANCE.createCounteract()));

		newChildDescriptors.add
			(createChildParameter
				(PatternsPackage.Literals.PROBLEM_SPECIFICATIONS__SPECIFICATION_PATTERNS,
				 PatternsFactory.eINSTANCE.createDelayed()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return QuantitativePatternsEditPlugin.INSTANCE;
	}

}
